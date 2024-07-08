package minimini.arr;

public class Arr_test3 {
    public static void main(String[] args) {
        final int row = 4;
        final int col = 4;

        int lastrowindex = row - 1;
        int lastcolindex = col - 1;


        int[][] arr = new int[row][col];

        for (int i = 0; i < lastrowindex; i++) {

            for (int j = 0; j < lastcolindex; j++) {
                arr[i][j] = (int) (Math.random() * 9) + 1;
                arr[i][lastcolindex] += arr[i][j];
                arr[lastrowindex][j] += arr[i][j];
                arr[lastrowindex][lastcolindex] += arr[i][j];
            }
        }
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
