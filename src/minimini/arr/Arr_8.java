package minimini.arr;

public class Arr_8 {
    public static void main(String[] args) {
        int[] arr = {10, 30, -5, -8, 17};
        //양수들의 평균
        int sum = 0;
        int cnt = arr.length;

        for (int i : arr) {
            if (i >= 0) {
                sum += i;
            } else {
                cnt--;
            }
        }
        System.out.println("양수들의 평균");
        System.out.println((double) sum / cnt);
    }
}