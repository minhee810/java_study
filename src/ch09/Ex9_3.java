package ch09;

public class Ex9_3 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

    }

    // String 클래스는 문자열의 내용이 같으면 동일한 해시코드를 반환하도록 hashCode() 가 오버라이딩되어있기 때문에 문자열의 내용이 같으면 true
    // 반면 identityHashCode() 는 객체의 주소값으로 해시코드를 생성하기 때문에 모든 객체에 항상 다른 해시코드값을 반환할 것을 보장한다. 따라서 서로 다른 객체라는 것을 알 수 있다.
}
