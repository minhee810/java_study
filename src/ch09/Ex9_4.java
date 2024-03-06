package ch09;

class Card{
    String kind;
    int number;

    Card() {
        this("SPADE", 1);
    }

    public Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
}

public class Ex9_4 {
    public static void main(String[] args) {
        Card2 c1 = new Card2();
        Card2 c2 = new Card2();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
