package eachDayLastTest.Class240628;

public class Circle {
    private int x;
    private int y;
    private int r;

    Circle(int x,int y,int r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public String toString(){
        return "Circle("+x+","+y+")반지름 "+r;
    }
    public boolean equals(Circle a){
        return this.x == a.x && this.y == a.y;
    }

}
