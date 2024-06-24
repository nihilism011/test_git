package eachDayLastTest.firstWeek;

import com.sun.source.tree.ContinueTree;

import java.util.Random;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int pw = 0, cw = 0, vs = 0;
        String[] rock = {"가위", "바위", "보"};
        while(true) {
            System.out.println("가위(0), 바위(1) 보(2) 입력 :");
            int player = sc.nextInt();
            int computer = ran.nextInt(3);
            if(player<0||player>2){
                System.out.println("잘못된 입력입니다.");
                continue;
            }
            String p = rock[player];
            String c = rock[computer];

            System.out.println("Player : " + p);
            System.out.println("컴퓨터 : " + c);
            if (player == computer) {
                System.out.println("비겼습니다.");
                vs++;
            } else if ((player == 0 && computer == 1) || (player == 1 && computer == 2) || (player == 2 && computer == 0)) {
                System.out.println("컴퓨터 win!");
                cw++;
            } else {
                System.out.println("Player win!");
                pw++;
            }


            System.out.println("Player ==>" + pw + "승 " + cw + "패 " + vs + "무");
            System.out.println("재대결(1), 종료(2)");
            if (sc.nextInt() == 1) {
                continue;
            } else
                System.out.println("종료 되었습니다.");
            break;
        }

    }
}

