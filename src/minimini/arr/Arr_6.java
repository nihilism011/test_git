package minimini.arr;

import java.util.Arrays;
import java.util.Scanner;

public class Arr_6 {
    public static void main(String[] args) {
        //크기가 5인 배열을 만들고
        //5개의 숫자를 직접 입력해서 배열을 채우기
        //그중 가장 큰 숫자와 작은 숫자의 위치 바꾸기
        //중복된 숫자는 입력하지 않는다.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];                     //크기가 5인 배열
        int maxindex = 0;
        int minindex = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + "번째 숫자를 입력해 주세요 : ");
            arr[i] = sc.nextInt();
            if (arr[maxindex] < arr[i]) {
                maxindex = i;
            }
            if (arr[minindex] > arr[i]) {
                minindex = i;
            }
        }
        int max = arr[maxindex];
        int min = arr[minindex];
        System.out.println("max: " + max);
        System.out.println("min: " + min);

        System.out.println("입력 된 배열 : " + Arrays.toString(arr));
        arr[maxindex] = min;
        arr[minindex] = max;
        System.out.println("변경 된 배열 : " + Arrays.toString(arr));

    }
}
