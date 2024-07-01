package 문제풀이.secondweek.Class2024_06_25;

public class Q2_main {
    public static void main(String[] args) {


        ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
        System.out.println(zeroPoint.toString() + "입니다.");
        ColorPoint cp = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색 점
        cp.setXY(5, 5);
        cp.setColor("RED");
        System.out.println(cp + "입니다.");
        {
        }

    }
}