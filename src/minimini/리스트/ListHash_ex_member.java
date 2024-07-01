package minimini.리스트;

import java.util.HashMap;
import java.util.Scanner;

public class ListHash_ex_member {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,HashMap<String,Object>> hash = new HashMap<>();
        while(true){
            System.out.println("== (1)입력 (2)검색 (3)종료 ==");
            System.out.println("메뉴를 선택하세요 : ");
            String input = sc.next();
            if (input.equals("1")) {
                HashMap<String,Object> map =new HashMap<>();
                System.out.print("이름을 입력하세요 :");
                map.put("name",sc.next());
                System.out.print("나이를 입력하세요 :");
                map.put("age",sc.next());
                System.out.print("주소를 입력하세요 :");
                map.put("adrr",sc.next());
                System.out.print("핸드폰 번호를 입력하세요 :");
                map.put("phone",sc.next());

                hash.put((String) map.get("name"),map);
                System.out.println();
                System.out.println("저장되었습니다.");

            } else if (input.equals("2")) {
                System.out.println("검색할 이름을 입력하세요 : ");
                String name = sc.next();
                if(hash.containsKey(name)){
                        System.out.println("이름 : "+hash.get(name).get("name"));
                        System.out.println("나이 : "+hash.get(name).get("age"));
                        System.out.println("주소 : "+hash.get(name).get("adrr"));
                        System.out.println("핸드폰 번호 : "+hash.get(name).get("phone"));
                    }else {
                    System.out.println("찾는 사람이 없습니다.");
                    continue;
                }
            } else if (input.equals("3")) {
                System.out.println("종료되었습니다.");
                break;
            } else{
                System.out.println("1,2,3중 하나만 입력");
            }
        }
    }
}
