package pkg2;

public class Tv {

    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }

}

class SmartTv extends Tv {
    String text;
    void caption() {
//        생략
    }
}
