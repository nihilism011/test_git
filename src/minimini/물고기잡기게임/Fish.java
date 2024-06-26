package minimini.물고기잡기게임;

import java.util.Random;

public class Fish extends GameObject {
    Random ran = new Random();
    Fish(){
        super(0,0,0);
    }

    public void move(){
    int rantemp = ran.nextInt(99);
        if(rantemp<25){
            x++;
        }    else if(rantemp>74){
            y--;
        }
    }

    public char getShape(){
        return '@';
    }
}


