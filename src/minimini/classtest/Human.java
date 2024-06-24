package minimini.classtest;

public class Human {
    String name;                //필드(field) : 객체 내에 값을 저장하는 멤버 변수
    int age;
    String adrr;
    static int money;

    Human(String name, int age, String adr) {
        this.name = name;
        this.age = age;
        adrr = adr;
        money = 150000;
    }

    void eat(String meel1, String meel2) {                 //메소드
        System.out.println(meel1 + "," + meel2 + "을 먹었다!");
    }

    void study() {
        System.out.println("클래스 개념은 중요하다.");
    }
}
