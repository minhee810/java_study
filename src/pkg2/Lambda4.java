package pkg2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda4 {
    public static void main(String[] args) {
        String[] lowercaseArray = new String[]{"public", "static", "void"};
        List<String> lowercaseList = Arrays.asList(lowercaseArray);

        // map() : 컬렉션의 요소들에 특정 연산을 적용한 새로운 스트림을 만든다.
        // 이때 입력으로 들어간 컬렉션의 수와 출력으로 나오는 컬렉션의 수는 동일하다.
        // 예를 들어 문자열 컬렉션의 모든 소문자 요소들을 대문자로 바꾸는 새로운 컬렉션은 다음과 같이 만들 수 있다.
        List<String> uppercaseList = lowercaseList.stream()
                .map(val -> val.toUpperCase()).collect(Collectors.toList());

        uppercaseList.stream().forEach(val-> System.out.println("val = " + val));

        
        List<String> uppercases = lowercaseList.stream()
                .map(upper-> upper.toUpperCase()).collect(Collectors.toList());
        
        uppercases.stream().forEach(upper  -> System.out.println("upper = " + upper));

        // collect(Collect.toList()) : 스트림을 간단하게 리스트로 만들 수 있다. 이렇게 리스트로 바꾸는 경우가 아주 많기 때문에 자바 16버전 부터는 .collect(Collect.toList()) 대신 .toList() 를 사용해 간결하게 코드를 작성하는 것이 가능해졌다.

    }
}
