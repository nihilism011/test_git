package jdbc;

import java.sql.*;
import java.util.Scanner;


public class JdbcTest {
    Scanner scan = new Scanner(System.in);
    Statement stmt = null;

    public JdbcTest() {
        try {
            Connection conn;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
            String db_id = "SYSTEM";
            String db_pw = "test1234";
            conn = DriverManager.getConnection(db_url, db_id, db_pw);
            stmt = conn.createStatement();

//            ResultSet rs = stmt.executeQuery("select * from tbl_student");
//            printData(rs);

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버 로드 오류");
        } catch (SQLException e) {
            System.out.println("DB 연결 오류");
        }
    }

    public void setId() {           //(1)추가
        try {
            String id;
            while (true) {
                System.out.print("아이디 입력 : ");
                id = scan.next();
                if (id.equals("0")) return;
                String idsql = "select * from tbl_student where id = '" + id + "'";
                ResultSet rs = stmt.executeQuery(idsql);
                if (rs.next()) {
                    System.out.println("이미 중복된 아이디가 있습니다. 다시 입력해주세요. \n id에 0 입력시 메인메뉴");
                    continue;
                } else {
                    break;
                }
            }
            System.out.print("이름 입력 : ");
            String name = scan.next();
            System.out.print("학과 입력 : ");
            String dept = scan.next();
            System.out.println("추가되었습니다.");

            stmt.executeUpdate("INSERT INTO TBL_STUDENT VALUES('" + id + "','" + name + "','" + dept + "')");

        } catch (SQLException e) {
            System.out.println("DB 연결 오류");
        }
    }

    public void deleteId() {           //(1)추가
        try {
            String id;
            System.out.print("삭제 할 아이디 입력 : ");
            id = scan.next();
            String idsql = "select * from tbl_student where id = '" + id + "'";
            ResultSet rs = stmt.executeQuery(idsql);
            if (rs.next()) {
                stmt.executeUpdate("DELETE FROM TBL_STUDENT WHERE ID = '" + id + "'");
                System.out.println("삭제되었습니다.");
            } else {
                System.out.println("해당하는 ID가 없습니다.\n 메인메뉴로 돌아갑니다.");

            }
        } catch (SQLException e) {
            System.out.println("DB 연결 오류");
        }
    }

    public void updateId() {           //(1)추가
        try {
            String id;
            while (true) {
                System.out.print("아이디 입력 : ");
                id = scan.next();
                if (id.equals("0")) return;
                String idsql = "select dept from tbl_student where id = '" + id + "'";
                ResultSet rs = stmt.executeQuery(idsql);
                if (rs.next()) {
                    System.out.print("현재 학과는 " + rs.getString("dept") + "입니다.\n" + "수정 할 학과 입력 : ");
                    String dept = scan.next();
                    stmt.executeUpdate("UPDATE TBL_STUDENT SET DEPT = '" + dept + "' WHERE ID = '" + id + "'");
                    System.out.println("수정되었습니다.");
                    break;
                } else {
                    System.out.println("해당하는 아이디가 없습니다. 다시 입력해주세요. \n id에 0 입력시 메인메뉴");
                    continue;
                }
            }
        } catch (SQLException e) {
            System.out.println("DB 연결 오류");
        }
    }


    public void printData() {
        try {
            ResultSet rs = stmt.executeQuery("select * from tbl_student");
            while (rs.next()) {
                System.out.print(rs.getString("id"));
                System.out.print("\t|\t" + rs.getString("name"));
                System.out.println("\t|\t" + rs.getString("dept"));
            }
        } catch (SQLException e) {
            System.out.println("DB 연결 오류");
        }

    }

}
