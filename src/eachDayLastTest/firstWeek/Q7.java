package eachDayLastTest.firstWeek;

import java.util.Random;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int pw = 0;
        int cw = 0;
        int vs = 0;

        for (int i = 0; i < 1; i++) {
            System.out.println("가위(0), 바위(1) 보(2) 입력 :");
            int player = sc.nextInt();
            int computer = ran.nextInt(3);
            String p = "";
            String c = " ";

            switch (player) {
                case 0:
                    p = "가위";
                    break;
                case 1:
                    p = "바위";
                    break;
                case 2:
                    p = "보";
                    break;
                default:
            }
            switch (computer) {
                case 0:
                    c = "가위";
                    break;
                case 1:
                    c = "바위";
                    break;
                case 2:
                    c = "보";
                    break;
                default:
            }
            System.out.println("Player : " + p);
            System.out.println("컴퓨터 : " + c);
            if (player == computer) {
                System.out.println("비겼습니다.");
                vs++;
                break;
            } else if (player == 0) {
                switch (computer) {
                    case 1:
                        System.out.println("컴퓨터 win!");
                        cw++;
                        break;
                    case 2:
                        System.out.println("Player win!");
                        pw++;
                        break;
                }
            } else if (player == 1) {
                switch (computer) {
                    case 2:
                        System.out.println("컴퓨터 win!");
                        cw++;
                        break;
                    case 0:
                        System.out.println("Player win!");
                        pw++;
                        break;
                }


            } else if (player == 2) {
                switch (computer) {
                    case 0:
                        System.out.println("컴퓨터 win!");
                        cw++;
                        break;
                    case 1:
                        System.out.println("Player win!");
                        pw++;
                        break;
                }
            }
            System.out.println("Player ==>" + pw + "승 " + cw + "패 " + vs + "무");
            System.out.println("재대결(1), 종료(2)");
            int coin = sc.nextInt();
            switch (coin) {
                case 1:
                    i--;
                    break;
                case 2:
                    System.out.println("종료 되었습니다.");
            }

        }
    }
}
