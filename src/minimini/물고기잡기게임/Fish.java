package minimini.물고기잡기게임;

import java.util.Random;


public class Fish extends GameObject {
    Random ran = new Random();

    Fish() {
        super(Game.MAX_X/2, Game.MAX_Y/2, Game.FISH_D);
    
    }

    public void move() {
        int rantemp = ran.nextInt(100);
        if (rantemp < Game.FISH_PER/4) {
            if (x < Game.MAX_X - distance) x += distance;
        } else if (rantemp < Game.FISH_PER/2) {
            if (y < Game.MAX_Y - distance) y += distance;
        } else if (rantemp < Game.FISH_PER/4*3) {
            if (x > distance - 1) x -= distance;
        } else if (rantemp < Game.FISH_PER) {
            if (y > distance - 1) y -= distance;
        }
    }

    public char getShape() {
        return '@';
    }
}


