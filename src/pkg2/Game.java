package pkg2;


abstract class Game {
    int x, y;
    abstract void move(int x, int y);

    void stop(){
        // 현재 위치에 정지
    };
}

class Marine2 extends Game{

    void move(int x, int y) {

    }

    void stimPack() {

    }
}

class Tank2 extends Game{
    void move(int x, int y) {

    }

    void changeMode() {

    }
}

class Dropship2 extends Game{
    void move(int x, int y) {

    }

    void load() {

    }

    void unload() {

    }

}
