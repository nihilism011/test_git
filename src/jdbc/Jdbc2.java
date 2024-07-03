package jdbc;

import java.sql.*;
import java.util.Scanner;


public class Jdbc2 {

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
            System.out.print("이름을 입력하세요 >> ");
            String name = sc.next();
            while(true) {
                System.out.print("학번을 입력하세요 >> ");
                String no = sc.next();
                ResultSet rs = null;
                rs = stmt.executeQuery("select * from student where stu_no = " + no);

                if(rs.next()) {
                    System.out.println("이미 등록된 학번입니다. 다시 입력해주세요");
                } else{
                    System.out.println("가입되었습니다.");
                    stmt.executeUpdate("insert into student(stu_name,stu_no) values ('"+name+"',"+no+")");
                    break;
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
