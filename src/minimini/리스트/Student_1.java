package minimini.리스트;

import java.util.*;

public class Student_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ArrayList<Student> stu = new ArrayList<>();
//        stu.add(new Student("홍길동","컴퓨터","1234",4.5);
//        stu.add(new Student("김철수","정보통신","1213",4.0);
        ArrayList<Student> stud = new ArrayList<>();
        while (true) {
            System.out.println("학생 이름,학과,학번,학점평균 입력하세요");
            String input = sc.nextLine();
            if (input.equals("그만")) break;
            String[] ob = input.split(",");
            double grade = Double.parseDouble(ob[3]) ;
                stud.add(new Student(ob[0],ob[1],ob[2],grade));
        }
        for(int i =0;i<stud.size();i++){
            System.out.println("---------------------------------");
            System.out.println("이름:"+stud.get(i).getName());
            System.out.println("학과:"+stud.get(i).getDepartment());
            System.out.println("학번:"+stud.get(i).getId());
            System.out.println("학점평균:"+stud.get(i).getId());
            System.out.println("---------------------------------");
        }
        HashMap<String,Student> hslist = new HashMap<>();
        for(int i = 0;i<stud.size();i++){
            hslist.put(stud.get(i).getName(),stud.get(i));
        }
        System.out.println(hslist.get("홍길동"));
    }
}
