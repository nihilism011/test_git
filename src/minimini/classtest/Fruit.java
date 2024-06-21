package minimini.classtest;

public class Fruit {
    String name;
    int price;

    Fruit(){
        System.out.println("과일정보 없음");
    }
    Fruit(String name,int price){
        this.name = name;
        this.price = price;
    }
    Fruit(String name){
        this.name = name;
    }
    int getPrice(int each){
        return each*price;

    }

}
