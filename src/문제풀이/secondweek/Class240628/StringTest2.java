package 문제풀이.secondweek.Class240628;

import java.util.Scanner;

public class StringTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(">>");
        for(int i = 0;i<str.length();i++){
            str.append(str.charAt(0));
            str.delete(0,1);
            System.out.println(str);
        }
    }
}
