package minimini.classtest;

import java.util.Scanner;

public class UseFruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fruit apple = new Fruit("사과", 3000);
        Fruit orange = new Fruit("오렌지");
        Fruit temp = new Fruit();

        System.out.println("사과의 개수 : ");
        int appleEach = sc.nextInt();
        int appleprice = apple.getPrice(appleEach);
        System.out.println(apple.name + " " + appleEach + "개의 가격은" + appleprice + "원");

    }
}
