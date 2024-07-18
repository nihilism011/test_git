package 프로그래머스테스트;

public class 문자열겹치기 {
    public static void main(String[] args) {

        String a = "He11oWor1d";
        String b = "lloWorl";
        String c = "HelloWorld";
        int s = 2;
        String str = "";
        //a의 s번째까지 그다음 b 그다음 a 나머지
        for(int i = 0;i<s;i++){
            str += a.charAt(i);
        }
        str += b;
        for(int i = s+b.length();i<a.length();i++){
            str += a.charAt(i);
        }

        System.out.println(str);
    }
}
