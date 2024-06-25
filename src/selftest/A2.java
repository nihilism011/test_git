package selftest;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자입력 : ");
        while (true) {
            int i = sc.nextInt();
            if (i > 100 || i < 0) {
                System.out.println("잘못 입력 다시 입력 : ");
            } else {
                System.out.println(i > 64 ? i+" : 큰수" : i > 29 ? i+" : 중간수" : i+" : 작은수");
                break;
            }
        }
    }
}
