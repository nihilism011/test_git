package minimini.물고기잡기게임;


import java.util.Arrays;
import java.util.Scanner;

public class Game {
    static void pan(GameObject a, GameObject b) {
        for (int j = 0; j < 10; j++) {
            if (j == a.getY()) {
                for (int i = 0; i < 20; i++) {
                    if (i == a.getX()) {
                        System.out.println(a.getShape());
                    } else {
                        System.out.print("- ");
                    }
                }
            } else {
                for (int i = 0; i < 20; i++) {
                    System.out.print("- ");
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bear bear = new Bear();
        Fish fish = new Fish();

        System.out.println("왼쪽(a), 아래(s), 위(d), 오른쪽(f)>>");

        String input = sc.next();


        while (bear.collide(fish)) {


        }
        System.out.println("Bear Wins!!");

    }
}