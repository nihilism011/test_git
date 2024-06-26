package minimini.좌석예약시스템;

import java.util.Arrays;
import java.util.Scanner;

public class Mainsys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sit s = new Sit("S");
        Sit a = new Sit("A");
        Sit b = new Sit("B");

        while (true) {
            System.out.println("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
            int input = sc.nextInt();

            if (input < 1 || input > 4) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                continue;

            } else if (input == 4) {
                System.out.println("종료");
                break;

            } else if (input == 2) {
                s.indexview();
                a.indexview();
                b.indexview();
                System.out.println("조회를 완료하였습니다.");

            } else if (input == 1) {
                System.out.print("좌석구분 S(1), A(2), B(3)>>");
                int sitinput = sc.nextInt();
                String[] temp;
                if (sitinput == 1) {
                    s.indexview();
                    temp = s.sit;
                } else if (sitinput == 2) {
                    a.indexview();
                    temp = a.sit;
                } else if (sitinput == 3) {
                    b.indexview();
                    temp = b.sit;
                } else {
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    continue;
                }
                System.out.print("이름>>");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("번호>>");
                int sitnum = sc.nextInt();
                if (sitnum > 0 || sitnum < 11) {
                    temp[sitnum - 1] = name;
                } else {
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    continue;
                }
            } else if (input == 3) {
                System.out.print("좌석 S(1), A(2), B(3)>>");
                int sitinput = sc.nextInt();
                String[] temp;
                if (sitinput == 1) {
                    s.indexview();
                    temp = s.sit;
                } else if (sitinput == 2) {
                    a.indexview();
                    temp = a.sit;
                } else if (sitinput == 3) {
                    b.indexview();
                    temp = b.sit;
                } else {
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    continue;
                }
                System.out.println("이름>>");
                sc.nextLine();
                String strtemp = sc.nextLine();
                for (int i = 0; i < temp.length; i++) {
                    if (temp[i].equals(strtemp)) {
                        temp[i] = " --- ";
                    }
                }
            }
        }
    }
}