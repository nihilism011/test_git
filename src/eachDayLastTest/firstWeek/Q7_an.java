package eachDayLastTest.firstWeek;

import java.util.Random;
import java.util.Scanner;

public class Q7_an {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int pw = 0, cw = 0, vs = 0;
        String[] choice = {"가위", "바위", "보"};
        while (true) {
            System.out.println("가위(0), 바위(1) 보(2) 입력 :");
            int p_num = sc.nextInt();
            int c_num = ran.nextInt(3);

            if(p_num <0|| p_num >2){                                    //0,1,2 외의 숫자를
                System.out.println("잘못된 입력입니다 다시 입력하세요.");  //입력할 경우 다시 입력하도록
                continue;                                               //되돌림
            }
            System.out.println("Player : " + choice[p_num]);
            System.out.println("컴퓨터 : " + choice[c_num]);
            if (p_num == c_num) {
                System.out.println("비겼습니다.");
                vs++;
            } else if ((p_num == 0 && c_num == 2) ||
                    (p_num == 1 && c_num == 0) ||
                    (p_num == 2 && c_num == 1)) {
                System.out.println("Player Win!");
                pw++;
            } else {
                System.out.println("Computer Win!");
                cw++;
            }
            System.out.println("Player ==>" + pw + "승 " + cw + "패 " + vs + "무");
            System.out.println("재대결(1), 종료(2)");
            if (sc.nextInt() != 1) {
                System.out.println("종료 되었습니다.");
                break;
            }

        }
    }
}
