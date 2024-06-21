package minimini.switch_case;

import java.util.Scanner;

public class Switch_Case3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 숫자 입력 : ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.print("연산자 입력 : ");
        String a = sc.nextLine();
        System.out.print(num1+" "+a+" "+num2+" = ");
        switch (a) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println((double)num1 / num2);
                break;
            default:
                System.out.println("잘못된 입력");
        }
    }
}
