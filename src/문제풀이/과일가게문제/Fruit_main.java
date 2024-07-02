package 문제풀이.과일가게문제;

import java.util.HashMap;
import java.util.Scanner;

public class Fruit_main {
    public static void nameMenu() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Fruit> fruitmap = new HashMap<>();
        while (true) {
            System.out.println("== (1)과일 추가 (2) 판매 (3) 개수확인 (그외) 종료");
            System.out.print("메뉴 선택 : ");
            String in = sc.next();
            if (!in.equals("1") && !in.equals("2") && !in.equals("3")) {
                System.out.println("종료");
                break;
            }
            System.out.print("과일명 입력  : ");
            String name = sc.next();
            Fruit fu;
            if (in.equals("1") && fruitmap.get(name) == null) {
                System.out.print("가격 입력 : ");
                int price = sc.nextInt();
                if (price < 0) {
                    System.out.println("음수 입력은 불가능");
                    continue;
                } else {
                    fu = new Fruit(name, price, 0);
                }
            } else {
                fu = fruitmap.get(name);
            }
            if (in.equals("3")) {
                fu.info();
                continue;
            }
            System.out.print("갯수 입력 : ");
            int ea = sc.nextInt();
            if (ea < 0) {
                System.out.println("음수 입력은 불가능");
                continue;
            }
            switch (in) {
                case "1"://과일 추가
                    fu.addfruit(ea);
                    break;
                case "2"://판매
                    fu.sell(ea);
                    break;
            }
            fruitmap.put(name, fu);
        }
    }
}
