package ch09;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Card2)) {
            return false;
        }

        Card2 c = (Card2) obj;
        return this.kind.equals(c.kind) && this.number == c.number; // this.kind.equals(c.kind) kind 는 String 이기 때문에 equals() 로 비교해야함.
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, number);
    }
}

public class Ex9_5 {
    public static void main(String[] args) {
        Card2 c1 = new Card2();
        Card2 c2 = new Card2();
//        Card2 c2 = new Card2("HEART", 10);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

    }

    /* 결과 값
    kind : SPADE, number : 1
    kind : SPADE, number : 1
    true
    -1842861219
    -1842861219
     */
}
