package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcTest_main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        JdbcTest jdbc = new JdbcTest();

        while (true) {
            System.out.println("추가(1) 삭제(2) 수정(3) 확인(4) 끝내기(5) ");
            System.out.print("메뉴 번호 입력 >> ");
            String input = sc.next();
            //메뉴 입력

            switch (input) {
                case "1":
                    jdbc.setId();   //추가 > 아이디 입력,이름 입력,학과 입력 받아서
                    break;
                case "2":
                    jdbc.deleteId();//삭제> 삭제할 아이디 입력
                    break;
                case "3":
                    jdbc.updateId();
                    //수정> 아이디 입력,수정할 학과 입력
                    break;
                case "4":
                    jdbc.printData();
                    //확인
                    break;
                case "5":
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("정상적인 입력이 아닙니다.");

            }
        }


    }
}
