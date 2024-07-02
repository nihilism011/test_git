package 문제풀이.컬렉션심화문제;

import java.util.Random;
import java.util.Scanner;

public class Word_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        WordQuiz quiz = new WordQuiz("a");
        System.out.println("\"영어테스트\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
        System.out.println("현재 " + 17 + "개의 단어가 들어 있습니다.");
        while(true){
            int an = quiz.quiz();
            int input = sc.nextInt();
            if(input == -1)break;


            if(quiz.quizOk(an,input)){
                System.out.println("정답! !!");
            }else System.out.println("틀렸음! !!");
        }
    }
}