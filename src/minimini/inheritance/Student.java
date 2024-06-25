package minimini.inheritance;


public class Student extends Person {
    String stuNo;       //학번
    String stuDept;   //학과
    Student() {
        System.out.println("Student 기본 생성자");
    }

    Student(String name, int age,String stuNo,String stukDept) {
        super(name,age);
        this.stuDept = stukDept;
        this.stuNo = stuNo;
    }
    void veiwStudent(){
    }

}
