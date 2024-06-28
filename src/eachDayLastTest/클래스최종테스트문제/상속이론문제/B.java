package eachDayLastTest.클래스최종테스트문제.상속이론문제;

public class B extends OddDetector {
    public B(int n) {
        super(n);
    }
    public boolean isOdd(){
        return n%2==1;
    }
    public static void main(String[] args) {
        B b = new B(10);
        System.out.println(b.isOdd());
    }
}
