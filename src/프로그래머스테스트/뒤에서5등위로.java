package 프로그래머스테스트;

import java.util.Arrays;

public class 뒤에서5등위로 {
    public static void main(String[] args) {
//        정수로 이루어진 리스트 num_list가 주어집니다.
//        num_list에서 가장 작은 5개의 수를 제외한 수들을
//        오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
//        [12, 4, 15, 46, 38, 1, 14, 56, 32, 10]
//        [15, 32, 38, 46, 56]
        int[] arr = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        int[] answer = {};

        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[maxIndex] > arr[j]) {
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }
}
