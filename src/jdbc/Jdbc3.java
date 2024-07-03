package jdbc;

import java.sql.*;
import java.util.Scanner;


public class Jdbc3 {

    private static void printData(ResultSet rs)
            throws SQLException {
        while (rs.next()) {
            System.out.print(rs.getString("stu_name"));
            System.out.print("\t|\t" + rs.getString("stu_no"));
            System.out.println("\t|\t" + rs.getString("stu_dept"));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection conn;
        Statement stmt = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
            String db_id = "SYSTEM";
            String db_pw = "test1234";
            conn = DriverManager.getConnection(db_url, db_id, db_pw);
            stmt = conn.createStatement();

            while(true){
                System.out.print("삭제 할 학생 학번 >> ");
                String no = sc.next();
                String str = "DELETE FROM STUDENT WHERE STU_NO = " + no;
                int k = stmt.executeUpdate(str);
                if (k == 1) {
                    System.out.println(no + "번 학생이 삭제됩니다.");
                    break;
                } else {
                    System.out.println("해당 학번은 존재하지 않습니다.");
                }
            }
            ResultSet rs = stmt.executeQuery(("select * from student"));
            printData(rs);

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버 로드 오류");
        } catch (SQLException e) {
            System.out.println("DB 연결 오류");
        }
    }

}
