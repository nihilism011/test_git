package 문제풀이.secondweek.상속240625;

public class TV {
    private int size;
    public TV(int size){        //int형 자료 하나를 받는 setter 생성자
        this.size = size;
    }
    protected int getSize(){
        return size;
    }
}
