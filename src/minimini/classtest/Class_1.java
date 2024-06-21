package minimini.classtest;

public class Class_1 {
    public static void main(String[] args) {
        Human rits = new Human("ritsl",32,"계산");
        System.out.print(rits.name);
        System.out.print(rits.age);
        System.out.println(rits.adrr);

        Human min = new Human("min",30,"인천");
        System.out.print(min.name);
        System.out.print(min.age);
        System.out.println(min.adrr);

        rits.eat("아침", "김치찌개");
        rits.study();
    }
}
