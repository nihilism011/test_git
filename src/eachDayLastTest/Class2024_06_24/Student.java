package eachDayLastTest.Class2024_06_24;

public class Student {
    private int stuNo;      //학번
    private String stuName; //이름
    private String stuDept; //학과
    private int age;        //나이
    private String gender;  //성별

    public Student(int stuNo, String stuName) {
        this.stuNo = stuNo;
        this.stuName = stuName;
    }

    public Student(int stuNo, String stuName, String stuDept) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.stuDept = stuDept;
    }

    public void setInfo(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }
}
