package minimini.switch_case;

import java.util.Scanner;

public class Switch_Case2 {
    public static void main(String[] args) {
        //숫자 1개를 입력받아서
        //90이상이면  A
        //80 B
        //70 C
        //그 외는 F
        //점수는 0~100 까지 입력한다 가정
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요 : ");
        int score = sc.nextInt();
        switch (score / 10) {
            case 10, 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            default:
                System.out.println("F");
                break;
        }
    }
}
