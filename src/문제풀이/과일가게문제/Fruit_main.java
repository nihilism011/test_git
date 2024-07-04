package 문제풀이.과일가게문제;

import java.util.HashMap;
import java.util.Scanner;

public class Fruit_main {
    public static void nameMenu() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Fruit> fruitmap = new HashMap<>(); //Fruit 과일들을 fruitmap 해쉬맵에 <이름,과일객체>로 저장할곳

        while (true) {
            System.out.println("== (1)과일 추가 (2) 판매 (3) 개수확인 (그외) 종료");
            System.out.print("메뉴 선택 : ");
            String in = sc.next();      //메뉴 번호 입력
            //여기까지 고정

            if (!in.equals("1") && !in.equals("2") && !in.equals("3")) {
                System.out.println("종료");
                break;
            }
            //1,2,3 외의 다른 입력일 경우 종료 . 여기까지도 일단 고정

            System.out.print("과일명 입력  : ");
            String name = sc.next();
            Fruit fruit; //Fruti 객체 미리 선언.
            //1,2,3의 어떤 메뉴라도 과일명 입력이 필수

            if (in.equals("1") && fruitmap.get(name) == null) { //메뉴1번을 선택했을때 과일이 없는 경우 과일 추가
                System.out.print("가격 입력 : ");
                int price = sc.nextInt();       //가격 입력

                if (price < 0) {
                    System.out.println("음수 입력은 불가능");
                    continue;
                } else {
                    fruit = new Fruit(name, price, 0);      //name과 가격만 저장 개수는 0으로 초기화
                }
            } else {                //과일이 있다면 Fruit fruit 에 그 과일에 해당하는 과일 담음
                fruit = fruitmap.get(name);
            }
            if (in.equals("3")) {
                fruit.info();
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
                    fruit.addfruit(ea);
                    break;
                case "2"://판매
                    fruit.sell(ea);
                    break;
            }
            fruitmap.put(name, fruit);
        }
    }
}
