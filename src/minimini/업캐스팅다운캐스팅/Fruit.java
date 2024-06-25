package minimini.업캐스팅다운캐스팅;

public class Fruit {
    private String name;
    private String color;
    private int price;

    Fruit(String name,String color,int price){
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    void getPrice(){
        System.out.println(name+"은/는 "+price+"원 입니다.");
    }
}
