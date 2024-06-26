package 문제풀이.secondweek.Class2024_06_25;

public class Point3D extends Point {
    private int z;

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    void moveUp() {
        z++;
    }

    void moveDown() {
        z--;
    }
    void move(int x,int y,int z){
        move(x,y);
        this.z =z;
    }

    public String toString() {
        return "(" + getX() + "," + getY() + ","+z+")의 점";
    }
}
