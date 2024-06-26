package minimini.좌석예약시스템;

public class Sit {
    String[] sit = new String[10];
    String sitnum;
    Sit(String asitnum){      //객체를 만들때 배열내부를 전부 "---"로 초기화
        for(int i = 0; i< sit.length; i++){
            sit[i] = " --- ";
            this.sitnum = asitnum;
        }
    }

    void indexview() {    //자리 조회
        System.out.print(sitnum+">>");
        for (String i : this.sit) {
            System.out.print(i);
        }
        System.out.println();
    }
}
