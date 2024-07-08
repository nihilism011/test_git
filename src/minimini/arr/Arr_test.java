package minimini.arr;

import java.util.Random;

public class Arr_test {
    public static void main(String[] args) {
        Random ran = new Random();
        int[][] arr = new int[4][4];
        for(int[] i :arr){
            for(int j :i){
                j = ran.nextInt(10)+1;
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
