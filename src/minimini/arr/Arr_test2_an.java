package minimini.arr;

public class Arr_test2_an {
    public static void main(String[] args) {
        int intarray[][] = new int[4][4];
        int num =0;
        while (num <10){
            int row = (int) (Math.random()*4);
            int col = (int) (Math.random()*4);

            if(intarray[row][col] != 0){
                continue;
            } else {
                intarray[row][col] = ++num;
            }
        }

        for (int[] i : intarray) {
            for (int j : i) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
