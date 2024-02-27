package pkg2;
import java.util.Optional;

public class OptionalTest2 {
    private static Optional<String> getSomeString2() {
        return Optional.empty();  // null 을 반환하는 것이 아니라 비어있는 Optional 객체를 반환한다.
    }

    // 반환된 문자열이 비어있지 않은 경우 (empty 가 아닌 경우) 에는 ifPresent 의 인자로 들어간 람다 표현식을 실행하고,
    // 비어있는 경우에는 실행되지 않는다.

    public static void main(String[] args) {
        Optional<String> inThisNull = getSomeString2();

        // ifPresent() : 값이 존재할 수도 있고 존재하지 않을 수도 있는 값을 감사는 래퍼 클래스. Optional 객체에 값이 존재할 때만 지정된 동작을 수행한다. 존재하지 않을 경우 아무 동작도 수행하지 않는다.
        inThisNull.ifPresent(str -> System.out.println("str.toUpperCase() = " + str.toUpperCase()));
    }
}
