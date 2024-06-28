package eachDayLastTest.클래스최종테스트문제;

public class ChildClass extends ParentClass {


    void gugudan(int i) {
        System.out.println("=== " + i + "단을 선택했습니다. ===");
        super.gugudan(i);
        System.out.println("=== 종료되었습니다. ===");
    }


    void objType(Object a) {
        if (a instanceof String) {
            System.out.println("문자열 입니다.");
        } else if (a instanceof Integer) {
            System.out.println("정수 입니다.");
        } else {
            System.out.println("문자나 정수가 아닙니다.");
        }
    }

}
