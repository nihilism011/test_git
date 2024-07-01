package 문제풀이.secondweek.Class240628;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println(">>");
            String str = sc.nextLine();
            str = str.trim();
            if(str.equals("그만")) break;
//            int i =1;
//            for(int j =0;j<str.length();j++){
//                if((str.charAt(j)==' ')){
//                    i++;
//                }
//            System.out.println("어절 개수는 "+i);
            StringTokenizer st = new StringTokenizer(str);
            System.out.println("어절 개수는 "+st.countTokens());

        }

        sc.close();
    }
    }

