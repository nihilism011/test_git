package minimini.arr;

import java.util.Arrays;
import java.util.Scanner;

public class Arr_3 {
    public static void main(String[] args) {
        //크기가 100인 배열에 1부터 100까지 순서대로 숫자
        Scanner scan = new Scanner(System.in);
        System.out.println("배열의 크기 입력 : ");
        int j = scan.nextInt();

        int[] arr = new int[j];

        for (int i = 0; i < arr.length; i++) arr[i] = i + 1;
        System.out.println(Arrays.toString(arr));


    }
}
