package minimini.classtest;

public class Human_Main {
    public static void main(String[] args) {
        Human rits = new Human("회사주세요", 32, "인천 계산동");
        Human emfprhs011 = new Human("하현수", 33, "인천 남촌동");
        Human nihilism011 = new Human("구글", 30, "풍림 아파트");

        final int num = 10;
        rits.age = 35;
        System.out.println(emfprhs011.age);

        nihilism011.money = 140000;
        System.out.println(rits.money);
        System.out.println(Human.money);


        System.out.println(Math.PI);
    }
}
