package minimini.arr;

public class Arr_1 {
    public String bb(String[] a, String[] b) {
        String str = "";
        for (String z : a) {
            boolean k = true;
            for (int i = 0; i < b.length; i++) {
                if (b[i] != null && z.equals(b[i])) {
                    b[i] = null;
                    k = false;
                    break;
                }
            }
            if (k) {
                return z;
            }
        }return str;
    }
}





