package minimini.상속예제;

public class Animal {
    String animal;
    int age;
    Animal(String a,int age){
        this.animal = a;
        this.age = age;
    }
    void info(){
        System.out.println("이름:"+animal+", 나이:"+age);
    }
    void sound(){
        System.out.println("동물이 소리를 냅니다.");
    }
}

