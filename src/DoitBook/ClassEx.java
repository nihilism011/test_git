package DoitBook;

public class ClassEx {
    int sID;            //멤버변수
    String name;        //멤버변수
    double height;      //멤버변수
    double weight;      //멤버변수

    public String getNme(){     //리턴값이 있기때문에 void가 없는 메서드
        return name;
    }
    public void setHeight(double high){     //리턴값이 없는 void 메서드
        height = high;
    }


    public ClassEx(){ } //디폴트 생성자

    public ClassEx(String yourname,int sID){    //id값과 yourname 값을 매개변수로 입력받아 ClassEx클래스를 생성하는 생성자
        this.sID = sID;     //this를 쓴 이유는 매개변수이름과 인스턴스 이름이 같아서 구분하기 위해 사용
        name = yourname;    //매개변수값과 인스턴스변수값이 달라서 굳이 this를 쓰지 않아도 됨. 옳은지는 잘 ㅁ?ㄹ
    }
}
