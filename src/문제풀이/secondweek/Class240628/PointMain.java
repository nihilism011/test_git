package 문제풀이.secondweek.Class240628;

public class PointMain {
    public static void main(String [] args) {
        MyPoint p = new MyPoint(3, 50);
        MyPoint q = new MyPoint(4, 50);
        System.out.println(p);
        if(p.equals(q)) {
            System.out.println("같은 점");
        } else {
            System.out.println("다른 점");
        }
    }
}
