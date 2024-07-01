package 문제풀이.클래스최종테스트문제;

public class ParentClass {
    private String name;

    ParentClass(String name) {
        this.name = name;
        System.out.println(this.name + "님 자바 클래스 테스트를 시작합니다!");
    }

    public void setName(String name) {
        this.name = name;
    }

    ParentClass() {
    }

    void gugudan(int i) {
        for (int j = 1; j < 10; j++) {
            System.out.println(i + " * " + j + " = " + (i * j));
        }
    }

    int arrBigNum(int[] a) {
        int j = a[0];
        for (int i : a) {
            if (j < i) j = i;
        }
        return j;
    }
}
