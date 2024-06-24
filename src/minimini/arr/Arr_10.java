package minimini.arr;

import java.util.Arrays;

public class Arr_10 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = arr1;

        arr2[0] = 10000;
        System.out.println(Arrays.toString(arr1));

    }

}

