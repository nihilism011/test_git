package 문제풀이.secondweek.Class2024_06_24;

public class Student_Main {
    public static void main(String[] args) {
        Student hong = new Student(1234,"홍길동");
        Student yu = new Student(1357,"유재석","컴퓨터학과");
        hong.setInfo(20,"남");
        int age = hong.getAge();
        System.out.println(age);
        System.out.println(hong.getAge());

    }
}
