package minimini.인터페이스;

public interface Calc {
    //덧셈,뺄셈,나눗셈,곱셈 설계
    //매개변수 두개(정수)만 받아서 처리
    int sum(int x, int y);  //return값 x+y (더하기)

    int sub(int x, int y);  //빼기

    int mul(int x, int y);  //(곱하기)

    int div(int x, int y);  //return값 x/y (나누기)
}
