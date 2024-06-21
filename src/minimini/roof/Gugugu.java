package minimini.roof;

import java.util.Random;
import java.util.Scanner;

public class Gugugu {
    /*구구단 프로그램을 만드세요.
    1. 처음 출력은 "문제풀이(1) 종료(그외 숫자)"
    2. 1을 선택하면 "몇 문제 푸시겠습니까?" 출력 후
    사용자가 입력한 숫자만큼 랜덤한 구구단 문제 출제
    정답을 입력할 경우"정답" 아닐경우 "오답!" 출력
    3. 문제를 다 풀었을 경우 다시 1번으로 돌아가서 선택하게 함
    4. 1번 메늉서 1을 제외한 다른 숫자를 누르면 "프로그램이 종료되었습니다" 출력 후 종료
    */
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("문제풀이(1) 종료(그외 숫자)");
            int startInput = scan.nextInt();
            if (startInput == 1) {
                System.out.println("몇문제 푸시겠습니까?");
                int num = scan.nextInt();
                for (int i = 0; i < num; i++) {
                    int a = ran.nextInt(8) + 2;
                    int b = ran.nextInt(9) + 1;
                    System.out.println(a + " X " + b + " = ");
                    int an = scan.nextInt();
                    if (an == a * b) {
                        System.out.println("정답!");
                    } else System.out.println("오답");
                }
            } else {
                System.out.println("프로그램이 종료되었습니다.");
                break;
            }
        }
    }
}