package eachDayLastTest.Class2024_06_25;

public class Q1_main {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5,5,"YELLOW");
        cp.setXY(10,20);
        cp.setColor("RED");
        String str = cp.tooString();
        System.out.println(str+"입니다. ");
    }
}
