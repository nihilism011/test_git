package minimini.arr;

import java.util.Arrays;
import java.util.Random;

public class Arr_test2 {
    public static void main(String[] args) {


        Random ran = new Random();

        int[][] arr = new int[4][4];

        int[] r = new int[10];
        //16 중 랜덤한 숫자 10개 임의의 위치 나머지 0
        for(int i =0;i<10;i++){
            boolean j =true;
            int rnum = ran.nextInt(10)+1;
            for(int k=0;k<i;k++){
                if(rnum == r[k]){
                    j=false;
                }
            }
            if(j)r[i]=rnum;
            else i--;
        }
        // int[] r 은 10개의 중복되지 않는 1~10 숫자가 담긴 배열

        for(int i =0;i<r.length;i++){
            int ran1 = ran.nextInt(4);
            int ran2 = ran.nextInt(4);

            if(arr[ran1][ran2]==0){
                arr[ran1][ran2] = r[i];
            }else i--;
        }
        // 랜덤한 자리에 숫자가 0이 아니면 r 을 넣음

        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j +" ");
            }
            System.out.println();
        }

    }
}