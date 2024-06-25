package selftest;

public class CalcMain {
    public static void main(String[] args) {
        GoodCalc calc = new GoodCalc();
        System.out.println(calc.add(2, 3));
        System.out.println(calc.subtract(2, 3));
        System.out.println(calc.everage(new int[]{2, 3, 4}));
    }
}
