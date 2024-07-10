package 시험;

import java.util.Arrays;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        int flg = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i+1)+"번째 숫자 : ");
            arr[i] = sc.nextInt();
            boolean flg2 = false;
            for (int k = 0; k < i; k++) {
                if(arr[i]==arr[k]&&flg<2){
                    flg++;
                } else if(arr[i]==arr[k]&&flg==1){
                    flg2 =true;
                }
            }
            if(flg ==2||flg2){
                i--;
                flg--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
