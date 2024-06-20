package minimini;

import java.util.Arrays;

public class Arr_5 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 11, 4, 2};  //배열 내부에 중복되는 숫자는 없다고 가정
        System.out.println("원래 배열"+Arrays.toString(arr));
        int max = arr[0];                    //배열중 가장 큰값
        int maxindex = 0;               //배열중 가장 큰값의 위치
        int min = arr[0];                    //배열중 가장 작은값
        int minindex = 0;               //배열중 가장 작은값의 위치

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxindex = i;

            }
            else if(min > arr[i]){
                min = arr[i];
                minindex = i;
            }
        }
        arr[maxindex] = min;                //가장큰 값을 가지는 index에 가장 작은값 넣기
        arr[minindex] = max;                //가장 작은 값을 가지는 index에 가장 큰 값 넣기
        System.out.println("가장 큰값과 작은 값의 위치를 바꾼 배열 : " + Arrays.toString(arr));
        System.out.println("가장큰 값: " + max);
        System.out.println("가장큰 값 index: " + maxindex);
        System.out.println("가장작은 값: " + min);
        System.out.println("가장작은 값 index: " + minindex);

    }
}
