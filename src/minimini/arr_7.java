package minimini;

public class arr_7 {
    public static void main(String[] args) {
        int[] arr = {2, 5, -2, 10, 33, 22, 45};
        int sum = 0;
        for (int i : arr) {           //i에 배열을 순차적으로 적용
            sum += i;
        }
        int a = (int) 10.5;         //형 변환 double 타입 데이터를 int에 담을때 (int) 다만,0.5는 날아가고 10만 담음.
        System.out.println(sum);
        System.out.println((double) sum / arr.length);

    }
}
