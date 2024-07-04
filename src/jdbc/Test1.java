package jdbc;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 3, 4, 10, 0};
        while (true) {
            System.out.print("숫자 입력 : ");
            int in = sc.nextInt();
            boolean flg = true;

            for (int a : arr) {
                if (in == a ) {
                    flg = false;
                    break;
                }
            }
            if (flg) {
                arr[4] = in;
                System.out.println(Arrays.toString(arr));
                break;
            } else System.out.println("중복된 숫자.");

        }
    }
}