package 문제풀이.firstWeek;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해 주세요 : ");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("숫자 "+num+" 는 짝수입니다.");
        }else {
            System.out.println("숫자 "+num+" = 홀수입니다.");
        }
    }
}
