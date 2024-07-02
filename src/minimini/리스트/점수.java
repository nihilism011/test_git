package minimini.리스트;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 점수 {

    public static int ranSc(String a,int j) {

        while (true) {
            System.out.print(a+">>");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if (input >= 0 && input <= j) {
                return input;
            } else System.out.println(0+"~"+j+ "사이의 값을 입력해 주세요");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<HashMap> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            HashMap<String, Object> map = new HashMap<>();
            System.out.print("이름 : ");
            map.put("name", sc.next());
            map.put("java", ranSc("자바",40));
            map.put("oracle", ranSc("오라클",35));
            map.put("html", ranSc("html",25));
            list.add(map);
            System.out.println("--------------");
        }
        for (HashMap i : list) {
            System.out.print("이름 :" + i.get("name") + ",");
            System.out.println("총점 :" + ((int) i.get("java") + (int) i.get("oracle") + (int) i.get("html")));
        }

    }

}

