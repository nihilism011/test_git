package 시험;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단을 시작합니다. 5문제. 3문제 정답시 탈출");
        while (true) {
            int answer = 0;
            for (int i = 0; i < 5; i++) {
                int dan = (int) (Math.random() * 8) + 2;
                int an = (int) (Math.random() * 9) + 1;
                System.out.print(i + 1 + ")" + dan + "x" + an + "= ");
                if (dan * an == sc.nextInt()) {
                    System.out.println("정답");
                    answer++;
                } else {
                    System.out.println("오답. 정답은 : " + dan * an);
                }
            }
            if (answer >= 3) {
                System.out.println(answer + "문제 정답.3문제 이상 정답이므로 구구단을 종료합니다.");
                break;
            } else {
                System.out.println(answer + "문제 정답.3문제 이상 틀렸습니다. 구구단을 다시 시작합니다.");
            }
        }
    }
}
