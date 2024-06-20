package minimini;

import java.util.Arrays;

public class Arr_4 {
    public static void main(String[] args) {
        int[] arr = {-1, -4, -5, -9, -2, -20, 5};
        //배열에서 가장 큰 숫자 찾기
        //가장 큰 숫자는 oo입니다. 출력
        System.out.println();
        int j = arr[0];
        int k = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (j < arr[i]) j = arr[i];
            else k = arr[i];
        }
        System.out.println(Arrays.toString(arr) + "중에서");
        System.out.println("가장 큰 숫자는 " + j + " 입니다");
        System.out.println("가장 작은 숫자는 " + k + " 입니다");
    }
}
