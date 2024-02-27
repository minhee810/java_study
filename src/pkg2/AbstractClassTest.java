package pkg2;


abstract class AbstractClassTest { // 추상 클래스
    abstract void play(int pos);
    abstract void stop();
}

class AudioPlayer1 extends AbstractClassTest{
    @Override
    void play(int pos) {        // 추상 메서드를 구현
        // 내용 생략
    }

    @Override
    void stop() {               // 추상 메서드를 구현
        // 내용 생략
    }
}

abstract class AbstractPlayer extends AbstractClassTest{
    @Override
    void play(int pos) {            // 추상 메서드를 구현
        // 내용 생략
    }
}

