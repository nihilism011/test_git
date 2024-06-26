package minimini.물고기잡기게임;

import java.util.Scanner;

public class Bear extends GameObject {
    Scanner sc = new Scanner(System.in);
    Bear(){
        super(0,0,0);
    }

    public void move(){
        String input = sc.next();
        switch (input){
            case "a" : x-=1;
                break;
            case "s" : y+=1;
                break;
            case "d" : x+=1;
                break;
            case "f" : y-=1;
                break;
        }
    } // 이동한 후의 새로운 위치로 x, y 변경


    public char getShape(){
        return 'B';
    }
}
