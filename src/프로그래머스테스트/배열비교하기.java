package 프로그래머스테스트;

public class 배열비교하기 {
    public static void main(String[] args) {
        int[] arr1 = {100, 17, 84, 1};
        int[] arr2 = {55, 12, 65, 36};
        int answer = 0;
        int a1 = 0;
        int a2 = 0;
        if(arr1.length == arr2.length){
        }else {
            for(int i : arr1){
                a1 += i;
            }
            for(int i: arr2){
                a2 += i;
            }
        }
        System.out.println(a1);
        System.out.println(a2);

    }
}
