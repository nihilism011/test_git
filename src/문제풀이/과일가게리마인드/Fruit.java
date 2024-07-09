package 문제풀이.과일가게리마인드;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Fruit {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HashMap<String,Object>> list = new ArrayList<>();
        while (true) {
            System.out.println("1.과일 추가 2.판매, 3.개수확인 (그외)종료");
            int menu = sc.nextInt();
            if (menu == 1) {
                //과일추가
                HashMap<String, Object> fruit = new HashMap<>();

                System.out.println("과일명 입력 : ");
                fruit.put("name", sc.next());
                System.out.println("가격 입력 : ");
                fruit.put("price", sc.nextInt());
                System.out.println("개수 입력 : ");
                fruit.put("ea", sc.nextInt());
                list.add(fruit);

            } else if (menu == 2) {
                //과일판매
                HashMap<String, Object> fruit = new HashMap<>();
                System.out.println("과일 이름 : ");
                String inName = sc.next();
                System.out.println("개수 입력 : ");
                int ea= sc.nextInt();
                for(int i = 0;i<list.size();i++){
                    String name = (String)list.get(i).get("name");
                    if(inName.equals(name)){
                        list.get(i).put("ea",(int)list.get(i).get("ea")-ea);
                    }
                }


            } else if (menu == 3) {
                System.out.println("과일 이름 : ");
                String inName = sc.next();
                for(int i =0;i<list.size();i++){
                    String name = (String)list.get(i).get("name");
                    if(inName.equals(name)){
                        System.out.println(name+"의 개수"+list.get(i).get("ea"));
                    }
                }
                //개수 확인


            } else {
                System.out.println("종료!");
                break;
            }


        }

    }
}
