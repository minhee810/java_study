package pkg2;

interface Fightable1 {
    void move(int x, int y);

    void attack(Fightable1 f);

}

abstract class Unit2 {
    int x, y;

    abstract void move(int x, int y);

    void stop() {
        System.out.println("멈춥니다.");
    }
}

class Fighter extends Unit2 implements Fightable1 {

    @Override
    public void move(int x, int y) {
        System.out.println("[ " + x + ", " + y + " ] 로 이동");
    }

    @Override
    public void attack(Fightable1 f) {
        System.out.println(f.toString() + "를 공격합니다. ");
    }
}


public class FighterTest {
    public static void main(String[] args) {

        Fighter f = new Fighter();
        f.move(100, 200);
        f.attack(f);

        Fightable1 f2 = new Fighter();
        f2.move(1000, 2000);    // Fightable1 인터페이스에는 stop() 메서드가 없기 때문에 호출 불가능
        f2.attack(f2);

        Unit2 u = new Fighter();
        u.move(100,300);
        u.stop(); // Unit 클래스에는 attack 메서드가 없기때문에 호출 불가능
    }
}
