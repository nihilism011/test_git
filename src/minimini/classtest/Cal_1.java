package minimini.classtest;

public class Cal_1 {
    public static void main(String[] args) {
        //메소드 오버로딩의 사용 예시
        Calculator cal = new Calculator();

        int a = cal.add(5, 5);
        System.out.println(a);
        int b = cal.add(5, 4, 3);
        System.out.println(b);
        double c = cal.add(3.14, 25.0);
        System.out.println(c);

    }
}
