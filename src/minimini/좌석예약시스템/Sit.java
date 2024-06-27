package minimini.좌석예약시스템;

import java.util.Scanner;

public class Sit {
    Scanner sc = new Scanner(System.in);

    String[] sit = new String[10];
    String sitnum;

    Sit(String asitnum) {      //객체를 만들때 배열내부를 전부 "---"로 초기화
        for (int i = 0; i < sit.length; i++) {
            sit[i] = " --- ";
            this.sitnum = asitnum;
        }
    }

    void indexview() {    //자리 조회
        System.out.print(sitnum + ">>");
        for (String i : this.sit) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
    }

    void requist() {
        indexview();
        System.out.print("이름>>");
        String name = sc.next();
        System.out.print("번호>>");
        int tempNum = sc.nextInt() - 1;
        if (tempNum < 0 || tempNum > 9) {
            System.out.println("잘못된 입력입니다.");
        } else if (sit[tempNum].equals(" --- ")) {
            sit[tempNum] = name;
        } else {
            System.out.println("이미 예약되어있는 좌석입니다.");
        }
    }

    void can() {
        indexview();
        System.out.println("이름>>");
        String strtemp = sc.next();
        int j = 0;
        for (int i = 0; i < sit.length; i++) {
            if (sit[i].equals(strtemp)) {
                sit[i] = " --- ";
            } else {
                j++;
            }

        }
        if (j == 10) {
            System.out.println("예약자 이름을 찾을 수 없습니다.");
        }
    }
}

