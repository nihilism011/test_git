package 문제풀이.secondweek;

public class TV {
    int size;
    String manufacturer;
    public TV() {
        this(32,"LG");
    }
    public TV(String manufacturer) {
        this(32,manufacturer);
    }
    public TV(int size, String manufacturer) {
        this.size = 32;
        this.manufacturer = manufacturer;
        System.out.println(size+"인치 "+manufacturer);
    }

    public static void main(String[] args) {
        TV tv = new TV(65,"삼성");
    }
    //반복되는 코드를 줄임.
}