package eachDayLastTest.Class2024_06_25;

public class ColorPoint extends Point {
    private String color;

    ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    ColorPoint() {
        this(0,0,"Black");
    }

    ColorPoint(int x, int y) {
        this(x,y,"Black");
    }

    void setColor(String color) {
        this.color = color;
    }

    void setXY(int x, int y) {
        move(x, y);
    }

    public String toString() {
        return color + "색의" + "(" + getX() + "," + getY() + ")의 점";
    }
}
