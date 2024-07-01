package 문제풀이;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 장학금 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("미래장학금관리시스템입니다.");
        HashMap[] hash = new HashMap[5];
        for (int i = 0; i < hash.length; i++) {
            HashMap<String, Double> map = new HashMap<>();
            System.out.println("이름과 학점>> ");
            String[] input = sc.nextLine().split(" ");
            String name = input[0];
            double score = Double.parseDouble(input[1]);
            map.put(name, score);
            hash[i] = map;
        }

    }


}

