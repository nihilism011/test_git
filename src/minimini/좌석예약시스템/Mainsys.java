package minimini.좌석예약시스템;

import java.util.Scanner;

public class Mainsys {
    public static void intro(Sit[] arr) {
        for (Sit i : arr) {
            i.indexview();
        }
        System.out.println("조회를 완료하였습니다.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sit[] arr = new Sit[3];
        arr[0] = new Sit("S");
        arr[1] = new Sit("A");
        arr[2] = new Sit("B");
        while (true) {
            System.out.println("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
            int input = sc.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.print("좌석구분 S(1), A(2), B(3)>>");
                    arr[sc.nextInt() - 1].requist();
                }
                case 2 -> intro(arr);
                case 3 -> {
                    System.out.print("좌석 S(1), A(2), B(3)>>");
                    arr[sc.nextInt() - 1].can();
                }
                case 4 -> {
                    System.out.println("종료");
                    return;
                }
                default -> System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }
}