package minimini.arr;

import java.util.Arrays;

public class Arr_9 {
    public static void main(String[] args) {
        String str[] = {"금요일","토요일 휴식","일요일 날라감"};
        System.out.println(Arrays.toString(str));
        for(int i = 0;i<str.length;i++){
            System.out.println(str[i]);
        }
        for(String i : str){
            System.out.println(i);
        }
    }
}
