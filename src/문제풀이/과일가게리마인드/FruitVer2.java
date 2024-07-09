package 문제풀이.과일가게리마인드;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FruitVer2 {
    static Scanner s = new Scanner(System.in);
    static ArrayList<HashMap<String, Object>> list = new ArrayList<>();

    static String fruitName() {
        System.out.println("과일 이름 : ");
        return s.next();
    }

    static int fruitEa() {
        System.out.println("과일 개수 : ");
        int ea = s.nextInt();
        if (ea > 0) {
            return ea;
        } else {
            System.out.println("0보다 큰 수를 입력해주세요.");
            return ea;
        }
    }

    static HashMap<String, Object> isfruit(String name) {

        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i).get("name"))) {
                return list.get(i);
            }
        }
        return null;
    }

    public static void main(String[] args) {


        label:
        while (true) {
            System.out.println("== (1)과일 추가 (2) 판매 (3) 개수확인 (4) 종료 ==");
            System.out.print("메뉴 선택 : ");
            String menu = s.next();

            switch (menu) {
                case "1": {
                    HashMap<String, Object> map;
                    String inputName = fruitName();
                    int ea = fruitEa();
                    if (ea < 1) continue;
                    map = isfruit(inputName);
                    if (map == null) {
                        map = new HashMap<>();
                        map.put("name", inputName);
                        map.put("ea", ea);
                        list.add(map);
                        System.out.println("새로운 과일이 추가되었습니다.");
                    } else {
                        int sum = (int) map.get("ea") + ea;
                        map.put("ea", sum);
                        System.out.println("과일" + inputName + " " + ea + "개 추가합니다.");
                        System.out.println("현재" + inputName + "의 개수 :" + sum);
                    }
                    break;
                }
                case "2": {
                    // 판매
                    String inputName = fruitName();
                    HashMap<String, Object> map = isfruit(inputName);
                    if (map == null) {
                        System.out.println("존재하지 않는 과일입니다.");
                        continue;
                    }
                    int ea = fruitEa();
                    if (ea < 1) continue;
                    int sum = (int) map.get("ea") - ea;
                    if (sum >= 0) {
                        map.put("ea", sum);
                        System.out.println("현재" + inputName + "의 개수 : " + sum);
                    } else System.out.println("그만큼 없습니다.");
                    break;
                }
                case "3": {
                    String inputName = fruitName();
                    HashMap<String, Object> map = isfruit(inputName);
                    if (map == null) {
                        System.out.println("존재하지 않는 과일입니다.");
                        continue;
                    } else System.out.println(inputName + "의 개수 : " + map.get("ea"));
                    break;
                }

                case "4":
                    System.out.println("종료되었습니다.");
                    break label;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }
}