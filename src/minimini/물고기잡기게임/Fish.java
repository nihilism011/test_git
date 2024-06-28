package minimini.물고기잡기게임;

import java.util.Random;


public class Fish extends GameObject {
    Random ran = new Random();

    Fish() {
        super(Game.MAX_X / 2, Game.MAX_Y / 2, Game.FISH_D);
    }

    public void move() {
        int rantemp = ran.nextInt(100);
        int ranmove = ran.nextInt(4);
        if (rantemp < Game.FISH_PER) {
            switch (ranmove) {
                case 0:
                    x += distance;
                    if (x >= Game.MAX_X) x = Game.MAX_X - 1;
                    break;
                case 1:
                    y += distance;
                    if (y >= Game.MAX_Y) y = Game.MAX_Y - 1;
                    break;
                case 2:
//                    x -= distance;
                    if (x < 0) x = 0;
                    break;
                case 3:
//                    y -= distance;
                    if (y < 0) y = 0;
                    break;
            }
        }
    }
    public char getShape() {
        return '@';
    }
}


