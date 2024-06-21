package minimini.classtest;

public class Calculator {
    //메소드 오버로딩의 예시
    int add(int num1, int num2) {
        return num1 + num2;
    }

    int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    double add(double num1, double num2) {
        return num1 + num2;
    }
}
