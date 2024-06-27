package minimini.상속예제;

public class Dog extends Animal {
    String breed;
    Dog(){
        super("정보없음",0);
    }
    Dog(String a, int age, String breed) {
        super(a, age);
        this.breed = breed;
    }

    @Override
    void sound() {
        System.out.println("멍멍!");
    }

    String getBreed() {
        return breed;

    }
}
