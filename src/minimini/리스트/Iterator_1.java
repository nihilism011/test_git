package minimini.리스트;

import java.util.Iterator;
import java.util.Vector;

public class Iterator_1 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2,100);

        System.out.println(v.iterator());
//        Iterator<Integer> it = v.iterator();
//        while(it.hasNext()){
//            int n = it.next();
//            System.out.println(n);
//        }
    }
}
