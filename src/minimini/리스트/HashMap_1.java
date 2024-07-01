package minimini.리스트;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMap_1 {
    public static void main(String[] args) {
        HashMap<String, Object> hong = new HashMap<String, Object>();
        hong.put("name", "홍길동");
        hong.put("age", 30);
        hong.put("addr", "인천");
        hong.put("phone", "010-1234-5678");
        HashMap<String, Object> min = new HashMap<String, Object>();
        min.put("name", "min");
        min.put("age", 31);
        min.put("addr", "인천");
        min.put("phone", "010-1235-5678");
        HashMap<String, Object> rits = new HashMap<String, Object>();
        rits.put("name", "rits");
        rits.put("age", 32);
        rits.put("addr", "계산");
        rits.put("phone", "010-5290-2267");

        System.out.println(min.get("name"));
        System.out.println(min.get("age"));
        System.out.println(min.get("addr"));
        System.out.println(min.get("phone"));

        ArrayList<HashMap<String,Object>> list = new ArrayList<>();
        list.add(hong);
        list.add(min);
        list.add(rits);
        System.out.println(list);
    }

}

