package TestAll;

import java.util.Random;
import java.util.Scanner;

public class Day3LastTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("1.10부터 50까지 중 3의 배수이면서 짝수만 화면에 출력");
        for (int i = 10; i < 51; i++) {
            if (i % 3 == 0 && i % 2 == 0) System.out.print("  " + i + "  ");
        }
        System.out.println();
        System.out.println("다음문제:enter");
        String a9 = scan.nextLine();

        System.out.println("2. 숫자를 두개 입력받고, 두 수의 합이 10이 넘을 경우 '큰 수' 아닐 경우 '작은 수' 출력");
        System.out.print("첫번째 숫자 : ");
        int a = scan.nextInt();
        System.out.print("두번째 숫자 : ");
        int b = scan.nextInt();
        if (a + b > 10) {
            System.out.println(a + " + " + b + " = " + (a + b) + " >10 : 큰 수");
        } else {
            System.out.println(a + " + " + b + " = " + (a + b) + " <10 : 작은 수");
        }
        System.out.println();
        System.out.println("다음문제:enter");
        String a4 = scan.nextLine();

        System.out.println("3.숫자를 하나 입력받고, 해당 숫자의 구구단 출력");
        System.out.print("구구단 단수 입력 : ");
        int c = scan.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.print(c + "X" + i + "=" + c * i + "  ");
        }
        System.out.println();
        System.out.println("다음문제:enter");
        String a7 = scan.nextLine();

        System.out.println("4. 1부터 100 사이의 랜덤한 숫자를 생성하고,/n" +
                "숫자를 입력 받아 랜덤한 숫자와 비교하여, \n" +
                "큰 수 인지 아닌지 판별하기\n" +
                "(ex, 랜덤 수 : 35, 입력 수 : 40 일 경우 '입력한 수가 더 큽니다' 출력, 반대일 경우 작다고 출력)");
        int d = ran.nextInt(100) + 1;
        System.out.print("숫자 입력: ");
        int e = scan.nextInt();
        if (d < e) {
            System.out.println("랜덤 수 : " + d + ", 입력 수 : " + e + " -> 입력한 수가 더 큽니다.");
        } else {
            System.out.println("랜덤 수 : " + d + ", 입력 수 : " + e + " -> 입력한 수가 더 작습니다.");
        }
        System.out.println();
        System.out.println("다음문제:enter");
        String a3 = scan.nextLine();

        System.out.println("6. 1부터 30까지 10~19의 숫자를 제외하고 화면에 출력하시오.\n" +
                "(ex, 1 2 3 4 5 6 7 8 9 20 21 22 ... 30)");
        for (int i = 1; i < 31; i++) {
            if (i >= 10 && i <= 19) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("다음문제:enter");
        String a01 = scan.nextLine();

        System.out.println("7. while 문을 이용하여 2단부터 9단까지 구구단을 출력하시오.\n" +
                "단, 4단과 8단은 출력하지 말 것.");
        int j = 2;
        while(j<10){
            if(j==4||j==8){
                j++;
                continue;
            }else{
                System.out.println();
                System.out.println("----"+j+"단----");
                int k = 1;
                while(k<10){
                    System.out.print(j + "X" + k + "=" + j * k + "  ");
                    k++;
                }
            }
            j++;
        }



    }
}
