package 문제풀이;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class 장학금 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("미래장학금관리시스템입니다.");

        HashMap<String, Double> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("이름과 학점>> ");
//            String[] input = sc.nextLine().split(" ");

//            map.put(input[0], Double.parseDouble(input[1]));
            map.put(sc.next(), (sc.nextDouble()));

        }
        System.out.print("장학생 선발 학점 기준 입력 >> ");
        double num = sc.nextDouble();
        Set<String> setlist = map.keySet();

        System.out.print("장학생 명단 : ");
        for (String j : setlist) {
            if (map.get(j) >= num) {
                System.out.print(j + " ");
            }
        }
    }
}





