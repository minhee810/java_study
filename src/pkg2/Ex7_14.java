package pkg2;

class Ex7_14 {
    static int outerCv = 0;
    private int outerIv = 0;

    void myMethod() {
        final int lv = 0; // 값이 바뀌지 않는 변수는 상수로 간주
        final int Lv = 0; // JDK 1.8 부터 final 생략 가능

        class LocalInner {        // 2. 지역 내부 클래스를 감싸고 있는 메서드의 상수만 사용가능.
            int liv = outerIv;
            int liv2 = outerCv;
            // 외부 클래스의 지역변수는 final 이 붙은 변수(상수) 만 접근 가능하다.
            int liv3 = lv;
            int liv4 = Lv;

            void method() {
                System.out.println(lv);
            }
        }
    }

    static class StaticInner {
        // static 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없다.
        // int siv = outerIv;
        static int scv = outerCv;
    }

    class InstanceInner {
        int iiv = outerIv; // 1. 외부 클래스의 private 멤버에도 접근이 가능하다.
        int iiv2 = outerCv;
    }
}