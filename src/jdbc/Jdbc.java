package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;


public class Jdbc {

    private static void printData(ResultSet rs)
            throws SQLException {
        while (rs.next()) {
            System.out.print(rs.getString("stu_name"));
            System.out.print("\t|\t" + rs.getString("stu_no"));
            System.out.println("\t|\t" + rs.getString("stu_dept"));
        }
    }

    public static void main(String[] args) {
        Connection conn;
        Statement stmt = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
            String db_id = "SYSTEM";
            String db_pw = "test1234";
            conn = DriverManager.getConnection(db_url, db_id, db_pw);
            stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(("select * from student"));
                printData(rs);
            System.out.println("\"안녕\"\n하세요");

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버 로드 오류");
        } catch (SQLException e) {
            System.out.println("DB 연결 오류");
        }
    }

}
