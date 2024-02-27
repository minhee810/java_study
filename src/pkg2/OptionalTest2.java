package pkg2;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalTest2 {
    private static Optional<String> getSomeString2() {
        return Optional.empty();  // null 을 반환하는 것이 아니라 비어있는 Optional 객체를 반환한다.
    }

    // 반환된 문자열이 비어있지 않은 경우 (empty 가 아닌 경우) 에는 ifPresent 의 인자로 들어간 람다 표현식을 실행하고,
    // 비어있는 경우에는 실행되지 않는다.

    public static void main(String[] args) {
        Optional<String> inThisNull = getSomeString2();

        inThisNull.ifPresent(str -> System.out.println("str.toUpperCase() = " + str.toUpperCase()));
    }
}
