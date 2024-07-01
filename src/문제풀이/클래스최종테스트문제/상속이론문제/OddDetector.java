package 문제풀이.클래스최종테스트문제.상속이론문제;

abstract public class OddDetector {
    protected int n;
    public OddDetector (int n) {
        this.n = n;
    }
    public abstract boolean isOdd(); // 홀수이면 true 리턴
}

