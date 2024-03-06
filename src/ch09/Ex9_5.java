package ch09;

class Card2 {
    String kind;
    int number;

    Card2() {
        this("SPADE", 1);  // Card2(String kind, int number) 를 호출
    }

    public Card2(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString() {  // public 조상의 접근 제어자 보다 범위가 좁으면 안됨. 따라서 public 으로 선언
        return "kind : " + kind + ", number : " + number;
    }

}
public class Ex9_5 {
    public static void main(String[] args) {
        Card2 c1 = new Card2();
        Card2 c2 = new Card2("HEART", 10);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
