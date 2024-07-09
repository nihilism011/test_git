package 문제풀이;

public class Main {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "uuellhouu";
        int answer = 0;
        for (int i = 0; i < str2.length(); i++) {
            if (str1.charAt(0) == str2.charAt(i)&&str1.length()<=str2.length()-i) {
                if (str1.equals(str2.substring(i, i + str1.length()))) {
                    answer = 1;
                    break;
                }

            }
        }
        System.out.println(answer);
    }
}
