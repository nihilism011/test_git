package minimini.arr;

import java.util.Arrays;

public class Arr_1 {

    public static void main(String[] args) {
        int[] num = new int[3]; //      [0,0,0]
        num[0] = 10;            //      [10,0,0] 배열의 index 값은 0부터 시작
        num[1] = 20;            //      [10,20,0]
        System.out.println(Arrays.toString(num));   //배열을 출력
        System.out.println(num[0]);                 //num배열의 index0의 값 출력

        int[] arr = {1, 2, 3, 4};        //[1,2,3]
        System.out.println(Arrays.toString(arr));


    }
}
