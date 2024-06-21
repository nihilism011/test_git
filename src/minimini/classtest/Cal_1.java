package minimini.classtest;

public class Cal_1 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.sum(4,5);
        int b = cal.sumnum;
        System.out.println(b);

        int a = cal.resum(5,5);
        System.out.println(a);
    }
}
