package minimini.물고기잡기게임;

import java.util.Scanner;


public class Bear extends GameObject {
    Scanner sc = new Scanner(System.in);

    Bear() {
        super(0, 0, Game.BEAR_D);
    }

    public void move() {
        System.out.print("왼쪽(a), 아래(s), 위(w), 오른쪽(f)>>");
        String input = sc.next();
        switch (input) {
            case "a" -> {
                if (x > distance - 1) x -= distance;
            }
            case "s" -> {
                if (y < Game.MAX_Y - distance) y += distance;
            }
            case "d" -> {
                if (x < Game.MAX_X - distance) x += distance;
            }
            case "w" -> {
                if (y > distance - 1) y -= distance;
            }
            default -> System.out.println("잘못된 입력");

        } // 이동한 후의 새로운 위치로 x, y 변경
    }


    public char getShape() {
        return 'B';
    }
}
