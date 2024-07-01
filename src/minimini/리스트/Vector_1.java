package minimini.리스트;

import java.util.Vector;

public class Vector_1 {
    public static void main(String[] args) {
        Vector<String> s = new Vector<String>(4);

        s.add("CPU");
        s.add("GPU");
        s.add("mainboard");

        s.add(2,"Cooler");

        System.out.println(s.size());
        System.out.println(s.capacity());
        s.add("led");
        System.out.println(s.size());
        System.out.println(s.capacity());

        System.out.println(s.toString());

        for (String j : s) {
            System.out.println(j);

        }
    }
}
