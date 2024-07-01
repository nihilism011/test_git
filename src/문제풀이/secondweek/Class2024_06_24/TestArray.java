package 문제풀이.secondweek.Class2024_06_24;

public class TestArray {
    public static void changeArray(int[] a) {
        int maxindex = 0;
        int minindex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[maxindex] < a[i]) {
                maxindex = i;
            }
            for (int j = 1; j < a.length; j++) {
                if (a[minindex] > a[j]) {
                    minindex = j;
                }
            }
        }
        int temp = a[maxindex];
        a[maxindex] = a[minindex];
        a[minindex] = temp;
    }

}

