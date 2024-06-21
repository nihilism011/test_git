package minimini.arr;

import java.util.Arrays;
import java.util.Scanner;

public class Arr_6An {
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
        }
        System.out.println("입력 된 배열 : " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxindex]) {
                maxindex = i;
            }
            if (arr[i] < arr[minindex]) {
                minindex = i;
            }
        }
        int temp = arr[maxindex];
        arr[maxindex]= arr[minindex];
        arr[minindex]= temp;
        System.out.println("입력 된 배열 : " + Arrays.toString(arr));
    }
}
