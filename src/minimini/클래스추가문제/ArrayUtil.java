package minimini.클래스추가문제;

public class ArrayUtil {
    static int[] concat(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length + arr2.length; i++)
            if(i<arr1.length){
                arr3[i] = arr1[i];
            }else{
                arr3[i] = arr2[i-arr1.length];
            }
        return arr3;
    }
}
//array1 = {1,5,7,9};
//array2 = {3,6,-1,100,77};

//결과 : [1 5 7 9 3 6 -1 100 77]
//배열1과 2를 합침
//배열1 다음에 바로 배열 2가 오오록 배열 두개를 받아서 합치는 concat메소드 작성