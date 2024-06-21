package minimini.classtest;

public class Calculator {
    //메소드 이름 sum,2개의 int 형 숫자를 받아서 더해줌
    int sumnum;

    void sum(int num1, int num2) {
        sumnum = num1 + num2;
    }

    int resum(int num1, int num2) {
        return num1 + num2;
    }
}
