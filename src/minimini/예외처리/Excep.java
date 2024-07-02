package minimini.예외처리;

import java.util.Scanner;

public class Excep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나뉨수 : ");
        int num = sc.nextInt();
        System.out.println("나눔수 : ");
        int num2 = sc.nextInt();
        try {
            System.out.println(num/num2);

        }catch (Exception e){
            System.out.println("0으로 나눌수 없음");
            System.out.println(e.getMessage());
        }
    }
}
