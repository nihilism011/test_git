package 문제풀이.firstWeek;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {


        int arr[] = {3, 5, 1, 8, 2};
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int minindex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minindex = i;

            }
        }
        int temp = min;
        arr[minindex] = arr[0];
        arr[0] = min;
        System.out.println("가작 작은 숫자 :" + min);
        System.out.println(Arrays.toString(arr));


    }
}