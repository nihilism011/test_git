package 문제풀이.과일가게문제;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Fruit_main {
    public static void nameMenu() {
        System.out.print("과일명 입력  : ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Fruit> fruitmap = new HashMap<>();
        while (true) {
            System.out.println("== (1)과일 추가 (2) 판매 (3) 개수확인 (그외) 종료");
            System.out.print("메뉴 선택 : ");
            String in = sc.next();
            switch (in) {
                case "1"://과일 추가
                    nameMenu();
                    Set<String> temp = fruitmap.keySet();
                    String name = sc.next();
                    for(String a : temp){

                    }
                    System.out.print("가격 입력 : ");
                    int price = sc.nextInt();
                    System.out.print("갯수 입력 : ");
                    int ea = sc.nextInt();
                    fruitmap.put(name, new Fruit(name, price, ea));
                    break;
                case "2"://판매
                    nameMenu();
                    String ffname = sc.next();
                    System.out.println("갯수 입력 : ");
                    fruitmap.get(ffname).sell(sc.nextInt());
                    fruitmap.get(ffname).info();
                    break;
                case "3":
                    nameMenu();
                    String fname = sc.next();
                    fruitmap.get(fname).info();

                    break;
                default:
                    System.out.println("종료");
                    return;

            }
        }
    }
}
