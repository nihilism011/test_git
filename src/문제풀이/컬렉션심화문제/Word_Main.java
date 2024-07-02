package 문제풀이.컬렉션심화문제;


import java.util.Scanner;

public class Word_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordQuiz quiz = new WordQuiz("영어테스트");

        while(true){
            quiz.quiz();
            int input = sc.nextInt();
            if(input == -1)break;

            if(quiz.quizOk(input)){
                System.out.println("정답! !!");
            }else System.out.println("틀렸음! !!");
        }
    }
}