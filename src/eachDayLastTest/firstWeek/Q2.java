package eachDayLastTest.firstWeek;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("숫자를 입력해주세요 (0~100): ");
            int num = sc.nextInt();
            if (num > 100 || num < 0) {
                System.out.println("잘못된 숫자입니다 ");
                continue;
            } else if (num > 64) {
                System.out.println("숫자 " + num + " = 큰 수");
                break;
            } else if (num > 29) {
                System.out.println("숫자 " + num + " = 중간 수");
                break;
            } else {
                System.out.println("숫자 " + num + " = 작은 수");
                break;
            }
        }
    }
}
