package minimini.classtest;

public class Tee {
    public static int mult(int a, int b) {
        return a * b;
    }

    public static int mult(int a, int b, int c) {
        return a * b * c;

    }

    public static void main(String[] args) {
        int tseta = Tee.mult(3, 4);
        int tsetb = Tee.mult(3, 4, 2);
        System.out.println(tseta);
        System.out.println(tsetb);
    }
}
