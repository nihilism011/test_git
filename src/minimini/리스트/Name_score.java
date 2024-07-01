package minimini.리스트;

import java.util.*;

public class Name_score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** 포인트 관리 프로그램 입니다. ***");
        HashMap<String, Integer> list = new HashMap<>();
        while (true) {
            System.out.println("이름과 포인트 입력>> ");
            String input = sc.nextLine();
            String[] arr = input.split(" ");
            String name = arr[0];
            int score = Integer.parseInt(arr[1]);
            if (list.containsKey(name)) {
                list.put(name,list.get(name)+score);
            }else{
                list.put(name, score);

            }

            Set<String> keyset = list.keySet();
            for (String str : keyset) {
                System.out.print("(" + str + "," + list.get(str) + ")");
            }
            System.out.println();
        }
    }
}
