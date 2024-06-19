package minimini;

import java.util.Random;
import java.util.Scanner;

public class GuGuDan {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        int count = 0;    //전체 문제수
        double cnt = 0;    //정답 문제수
        while (true) {
            System.out.println("구구단 시작(1), 채점(2), 종료(3)");
            int on = sc.nextInt();
            if (on == 1) {
                System.out.print("구구단을 시작 합니다 몇문제를 제출해드릴까요 :");
                int an = sc.nextInt();
                count += an;
                for (int i = 0; i < an; i++) {
                    int a = ran.nextInt(8) + 2;
                    int b = ran.nextInt(9) + 1;
                    System.out.print(a + " X " + b + " = ");
                    int c = sc.nextInt();
                    if (a * b == c) {
                        System.out.println("정답!");
                        cnt++;
                    } else {
                        System.out.println("	오답!");
                        while (true) {
                            System.out.println("다시 풀어보겠습니까? Yes(1), No(2)");
                            int re = sc.nextInt();
                            if (re == 1) {
                                System.out.println("정답은?:");
                                int rean = sc.nextInt();
                                if (rean == a * b) {
                                    System.out.println("정답");
                                    break;
                                } else {
                                    System.out.println("오답");
                                }
                            } else {
                                System.out.println("정답은 " + a * b);
                                break;
                            }

                        }
                    }
                }
            } else if (on == 2) {
                System.out.println("총합 " + count + " 문제를 풀었습니다.");
                System.out.println("그중 " + Math.round(cnt) + " 문제의 정답.");
                System.out.println("점수는" + Math.round(cnt / count * 100.0) + "점 입니다.");
                System.out.println("채점을 마쳤습니다. 구구단을 종료합니다.");
                break;
            } else if (on == 3) {
                break;
            } else {
                System.out.println("잘못된 숫자입니다. 다시 입력해주세요");
            }
        }
        sc.close();
    }
}


