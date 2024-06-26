package minimini.끝말잇기;

import java.util.Scanner;

public class charAttest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String start = "자바";
        String temp;
        int on = 0;

        System.out.print("게임에 참가하는 인원은 몇명입니까>>");    //참가자 명수를 입력하면
        String[] player = new String[sc.nextInt()];              //입력한 수 만큼의 크기를 가지는 배열 생성

        for (int i = 0; i < player.length; i++) {                    //이름을 입력하면
            System.out.println("참가자의 이름을 입력하세요>>");        //순서대로 앞서 만든 player 배열에
            player[i] = sc.next();                                  //넣어줌
        }
        System.out.println("시작하는 단어는 " + start + " 입니다");
        while (on == 0) {
            for (int i = 0; i < player.length; i++) {
                System.out.println(player[i] + ">>");
                temp = sc.next();

                if (temp.charAt(0) == start.charAt(start.length() - 1)) {
                    start = temp;
                    continue;

                } else {
                    on = 1;
                    System.out.println(player[i] + "님이 졌습니다.");
                    break;
                }
            }
        }
    }
}