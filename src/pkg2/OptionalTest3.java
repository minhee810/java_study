package pkg2;

import java.util.Optional;

public class OptionalTest3 {
    private static Optional<String> getSomeString() {
        // 매개변수로 전달된 값이 null 인지 확인한 뒤, null 이면 빈 Optional 객체를 생성, null 이 아니면 해당 값을 감사는 Optional 객체 생성
        return Optional.ofNullable("public static void");
    }

    public static void main(String[] args) {
        Optional<String> isThisNull = getSomeString();

        // null 이 아닌 경우 ifPresent 메서드 동작
        isThisNull.ifPresent(str -> System.out.println(str.toUpperCase()));

        // 안티 패턴 : 디자인 패턴 중 하나로 비효율적이거나 생산적이지 않은 패턴을 의미한다. 주로 코드의 가독성을 떨어뜨리거나 성능상 심각한 손실을 유발하므로 지양해야한다.
        // isPresent() 를 if문 처럼 잘못 사용한 사례
        if (isThisNull.isPresent()) {
            System.out.println(isThisNull.get().toUpperCase());
        }
    }
}
