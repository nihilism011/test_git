package minimini;

import java.util.Arrays;
import java.util.Scanner;

public class RoofRecycle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];


        for(int i = 0;i<arr.length;i++){
            System.out.println((i+1)+"번째 숫자를 입력해 주세요");
            arr[i] = scan.nextInt();
            if(arr[i]<0){
                System.out.println("0이상 숫자를 입력해 주세요");
                i--;
            }
        }
        System.out.println(Arrays.toString(arr));   //배열을 출력


    }
}
