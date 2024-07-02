package 문제풀이.컬렉션심화문제;

import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class WordQuiz {
    Random ran = new Random();

    private String name;
    private Vector<Word> v;


    public WordQuiz(String name) {
        this.name = name;
        v = new Vector<Word>();
        v.add(new Word("love", "사랑"));
        v.add(new Word("animal", "동물"));
        v.add(new Word("emotion", "감정"));
        v.add(new Word("human", "인간"));
        v.add(new Word("stock", "주식"));
        v.add(new Word("trade", "거래"));
        v.add(new Word("society", "사회"));
        v.add(new Word("baby", "아기"));
        v.add(new Word("honey", "꿀"));
        v.add(new Word("dall", "인형"));
        v.add(new Word("bear", "곰"));
        v.add(new Word("picture", "사진"));
        v.add(new Word("painting", "그림"));
        v.add(new Word("fault", "오류"));
        v.add(new Word("example", "보기"));
        v.add(new Word("eye", "눈"));
        v.add(new Word("statue", "조각상"));
    }

    public boolean quizOk(int a, int b) {
        return a == b - 1;
    }

    public int quiz() {
        ArrayList<String> list = new ArrayList<>();
        int an = ran.nextInt(4);
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = ran.nextInt(17);
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) i--;
            }
        }

        for (int i : a) {
            list.add(v.get(i).getKorean());
        }
        String str = "";
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i).getKorean().equals((list.get(an)))) {
                str = v.get(i).getEnglish();
            }
        }
        System.out.println(str + "?");


        for (int i = 0; i < list.size(); i++) {
            System.out.print("(" + (i + 1) + ")" + list.get(i) + " ");
        }
        return an;

    }

}
