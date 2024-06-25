package eachDayLastTest.상속240625;

public class IPTV extends ColorTV{
    private String ip;
    IPTV(String ip,int size,int color){
        super(size,color);      //super클래스인 ColorTV클래스에서 int형 자료 두개를 매개변수로 받는 생성자를 불러옴.
        this.ip = ip;
    }
    //ip주소의 getter메소드가 없기 때문에 생성자를 통해서만 ip주소를 할당 가능하고
    // ip주스는 클래스 내의 printProperty 메소드에서만 쓰일것이기 때문에 setter 메소드가 필요 없음.

    void printProperty(){
        System.out.print("나의 IPTV는 "+ip+"주소의 ");
        super.printProperty();
//        System.out.println("나의 IPTV는 "+ip+"주소의 "+getSize()+"인치 "+getColor()+"컬러");

    }
}
