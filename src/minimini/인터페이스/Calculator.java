package minimini.인터페이스;

public class Calculator implements Calc {
    @Override
    public int sum(int x, int y) {
        return x + y;
    }

    @Override
    public int sub(int x, int y) {
        return x - y;
    }

    @Override
    public int mul(int x, int y) {
        return x * y;
    }

    @Override
    public int div(int x, int y) {
        if (x == 0) {
            System.out.println("0으로 나눌수 없습니다.");
            return 0;
        } else {
            return x / y;
        }
    }
}
