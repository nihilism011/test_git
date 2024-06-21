package eachDayLastTest.firstWeek;

public class Q4 {
    public static void main(String[] args) {
        int arr[] = {3,5,1,8,2};
        int sum1= 0;
        int sum2= 0;

        for(int i : arr ){
            if(i%2==0){
                sum1 += i;
            }else {
                sum2 += i;
            }
        }
        System.out.println("짝수들의 합 : "+sum1);
        System.out.println("짝수들의 합 : "+sum2);
        System.out.println("짝수의 합과 홀수의 합의 차이 :"+Math.abs(sum1-sum2));
    }
}
