package 문제풀이.secondweek.Class240628;

public class MyPoint {
    private int x;
    private int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point(" + x + "," + y + ")";
    }

    boolean equals(MyPoint a) {
        return this.x == a.x && this.y == a.y;
    }
}
