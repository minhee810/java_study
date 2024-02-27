package pkg2;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);  // 보너스 점수는 제품 가격의 10%
    }
}

class Tv1 extends Product {
    Tv1() {
        // 조상 클래스의 생성자 Product(int price) 를 호출한다.
        super(100);  // Tv의 가격을 100 만원으로 호출한다.
    }

    // Object 클래스의 toString()을 오버라이딩한다.
    @Override
    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}

class Buyer {  // 고객, 물건을 사는 사람
    int money = 1000; // 소유 금액
    int bonusPoint = 0;  // 보너스점수

    void buy(Product p) {   // 부모타입이기 때문에 new Tv(), new Computer() 모두 들어올 수 있음.
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
        }
        money -= p.price;   // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint;   // 제품의 보너스 점수를 추가한다.
        System.out.println(p + "을/를 구입하셨습니다.");
    }
}

public class Ex7_8 {
    public static void main(String[] args) {
        Buyer b = new Buyer(); // 물건 사는 사람

        // 1번
        Product p = new Tv1();
        b.buy(p);

        // 2번 -> 1번 코드를 한 줄로 줄인 방식임.
//        b.buy(new Tv1()); -> 참조변수가 없기 때문에 해당 메서드에서 사용할 수 없다.
        b.buy(new Computer());

        System.out.println("현재 남은 돈은 " + b.money + "만원 입니다. ");
        System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");
    }
}
