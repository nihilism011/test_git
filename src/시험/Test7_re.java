package 시험;

import java.util.Arrays;
import java.util.Scanner;

public class Test7_re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + "번째 숫자 : ");
            arr[i] = sc.nextInt();

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    flg++;
                    break;
                }
            }
            if (flg == 2) {
                i--;
                flg--;
                System.out.println("중복은 한번만 허용 다시 입력해주세요.");
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}


