package minimini.inheritance;

public class Person {
    private String name;
    private int age;

    Person(){
        System.out.println("Person 기본 생성자");
    }
    Person(String name,int age){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void speak(){
        System.out.println("말한다.");
    }
    void eat(){
        System.out.println("먹는다.");
    }
    void work(){
        System.out.println("일한다.");
    }
}
