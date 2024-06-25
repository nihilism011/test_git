package minimini.업캐스팅다운캐스팅;

import java.util.ArrayList;

public class Fruit_main {


    static void fruitBox(Fruit f, int num) {
        System.out.println(f.getName()+"을 " + num + "개 포장했습니다.");
        if(f instanceof Banana){
            System.out.println(f.getName()+"전용 박스에 담았습니다.");
        }
        if(f instanceof Orange){
            System.out.println(f.getName()+"전용 박스에 담았습니다.");
        }

    }

    public static void main(String[] args) {
        Apple apple = new Apple("사과", "red", 1500);
        Banana banana = new Banana("바나나", "yellow", 5000);
        Orange orange = new Orange("오랜지", "orange", 2000);

        fruitBox(banana, 3);
        fruitBox(apple, 5);
        fruitBox(orange, 2);
        ArrayList<Object> list = new ArrayList<Object>();
        list.add("rits");
        list.add(5);
    }
}