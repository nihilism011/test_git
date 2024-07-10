package 시험;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManager {

    public int arrmax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (max < i) max = i;
        }
        return max;
    }

    public static int arrsum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public int[] makeArray() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + "번째 숫자 : ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static void main(String[] args) {
        ArrayManager u = new ArrayManager();
        int[] arr = u.makeArray();
        System.out.println(Arrays.toString(arr));

        int max = u.arrmax(arr);
        System.out.println("배열의 가장 큰 값 : " + max);
        int sum = ArrayManager.arrsum(arr);
        System.out.println("배열의 숫자의 합 : " + sum);
    }
}
