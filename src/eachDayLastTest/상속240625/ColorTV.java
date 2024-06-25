package eachDayLastTest.상속240625;

public class ColorTV extends TV {
    private int color;

    ColorTV(int size, int color) {
        super(size);        //super인 TV클래스에 int형 자료 하나를 매개변수로 받는
        //생성자를 실행
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    void printProperty() {
        System.out.println(getSize() + "인치 " + color + "컬러");
    }
}
