package minimini.리스트;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Student_an {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생의 이름,학과,학번,학점평균 을 입력하세요");
        System.out.println(">>");
        String info = sc.nextLine();
        StringTokenizer st = new StringTokenizer(info,",");
        String name = st.nextToken();
        String dpt = st.nextToken();
        String id = st.nextToken();
        String grade = st.nextToken();
        double z = Double.parseDouble(grade);
        Student student = new Student(name,dpt,id,z);
    }
}
