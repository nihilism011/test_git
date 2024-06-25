package eachDayLastTest.Class2024_06_25;

public class PositivePoint extends Point {
    PositivePoint() {
        super(0, 0);
    }

    PositivePoint(int x, int y) {
        super(x, y);
        if (x < 0 || y < 0) {
            move(0, 0);
        }
    }
    protected void move(int x, int y) {
        if (x >= 0 && y >= 0) {
            super.move(x,y);
        }

    }

    public String toString() {
        return "(" + getX() + "," + getY() + ")의 점";
    }
}

