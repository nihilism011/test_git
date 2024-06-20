package minimini;

public class Arr_5 {
    public static void main(String[] args) {
        int[] arr = {6,5,3,1,4};
        String star = "*";
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr[i];j++){
                System.out.print(star);
            }

            System.out.println();
        }

    }
}
