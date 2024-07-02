package 문제풀이.과일가게문제;

public class Fruit {
    private String name ;
    private int price ;
    private int ea;

    public Fruit(String name,int price,int ea){
        this.name = name;
        this.price = price;
        this.ea = ea;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getEa() {
        return ea;
    }
    public void sell(int i){
        this.ea = this.ea -i;
    }
    public void info(){
        System.out.println(name+"의 현재 남은 개수는"+ea+"입니다.");
    }
}
