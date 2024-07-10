package 시험;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HashMap<String, Object>> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            HashMap<String, Object> map = new HashMap<>();
            System.out.print((i+1) + "번째 사람 이름 : ");
            map.put("name", sc.next());
            while (true) {
                try {
                    System.out.print((i+1) + "번째 사람 나이 : ");
                    String inputAge = sc.next();
                    int age = Integer.parseInt(inputAge);
                    if (age > 0 && age <= 100) {
                        map.put("age", age);
                        break;
                    } else {
                        System.out.println("1~100 사이 값을 입력해주세요.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("숫자를 입력해주세요.");
                }
            }
            System.out.print((i+1) + "번째 사람 주소 : ");
            map.put("adr", sc.next());
            list.add(map);
        }
        for (HashMap<String, Object> j : list) {
            System.out.println(j);
        }
    }
}
