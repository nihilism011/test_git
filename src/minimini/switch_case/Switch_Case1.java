package minimini.switch_case;

import java.util.Scanner;

public class Switch_Case1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력");
        int num = sc.nextInt();
        switch (num) {
            case 5 :
                System.out.println("5입니다.");
                break;
            case 10:
                System.out.println("10입니다.");
                break;
            default :
                System.out.println("해당없음");
                break;
        }
    }
}
