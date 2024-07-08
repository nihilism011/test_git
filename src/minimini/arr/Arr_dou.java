package minimini.arr;

public class Arr_dou {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5,}, {3, 2, 5, 4, 1},{4,4,4}};

//        for (int i : arr[0]) System.out.print(i+" ");
//        System.out.println();
//        for (int i : arr[1]) System.out.print(i+" ");

        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j +" ");
            }
            System.out.println();
        }

        for(int i = 0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
