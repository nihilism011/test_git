package 문제풀이.컬렉션심화문제;

import java.util.*;

public class WordQuiz {
    Random ran = new Random();
    private int b;
    private Vector<Word> v;

    public WordQuiz(String name) {
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
        System.out.println("\"" + name + "\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
        System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다.");
    }

    public boolean quizOk(int a) {
        return a == b + 1;
    }

    public void quiz() {
        final int bogi = 4;
        ArrayList<Word> list = new ArrayList<>();
        b = ran.nextInt(bogi);
        Set<Integer> c = new HashSet<>();
        while (c.size() != bogi) {
            c.add(ran.nextInt(v.size()));
        }

        for (Integer i : c) {
            list.add(v.get(i));
        }
        System.out.println(list.get(b).getEnglish() + "?");
        for (int i = 0; i < bogi; i++) {
            System.out.print("(" + (i + 1) + ")" + list.get(i).getKorean() + " ");
        }


    }
}
