package 문제풀이.firstWeek;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 8, 2};
        int sum = 0;
        int cnt = 0;
        for (int i : arr) {
            if (i >= 3) {
                sum += i;
                cnt++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("3이상의 숫자의 합 =" + sum);
        System.out.println("3이상의 숫자의 개수 =" + cnt);
        System.out.println("3이상의 숫자의 평균 = " + (cnt==0?0:((double) sum / cnt)));
    }
}
