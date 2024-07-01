package 문제풀이.secondweek.Class2024_06_25;

public class Q3_main {
    public static void main(String[] args) {
        Point3D p = new Point3D(1, 2, 3);
        System.out.println(p.toString() + "입니다");

        p.moveUp(); // z 축으로 위쪽 이동
        System.out.println(p.toString() + "입니다.");

        p.moveDown(); // z 축으로 아래쪽 이동
        p.move(10, 10); // x, y 축으로 이동
        System.out.println(p.toString() + "입니다.");

        p.move(100, 200, 300); // x, y, z축으로 이동
        System.out.println(p.toString() + "입니다.");
    }
}
