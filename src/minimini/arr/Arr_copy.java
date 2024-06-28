package minimini.arr;


import java.util.Arrays;

public class Arr_copy {
    public static void main(String[] args) {


        int[] arr1 = {10, 20, 30, 40, 50};

        int[] arr2 = new int[arr1.length*2];

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

//        arr2 = Arrays.copyOf(arr1,arr1.length);
        System.arraycopy(arr1,0,arr2,0, arr1.length);
        System.out.println(Arrays.toString(arr2));


    }
}