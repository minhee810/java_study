package pkg2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda3 {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(integers);

        list.stream()
                .forEach(val -> System.out.println(val));
        
        // filter() : 컬렉션의 요소들 중 조건문에 맞는 요소만 뽑아 새로운 스트림을 만든다. 
        List evenList = list.stream()
                .filter(val -> val % 2 ==0).collect(Collectors.toList());
        evenList.stream().forEach(val -> System.out.println("even val = " + val));

        System.out.println("----------------------");

        // distinct() : 컬렉션의 요소에서 중복을 제겅한다. 중복을 제거한다는 행위가 이미 정해져있기 때문에 람다 표현식을 함수의 인자로 넘겨줄 필요가 없고, 이때 중복인지 아닌지를 판단하는 것은 요소들의 equals() 메서드이다.
        List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
        distinctList.stream().forEach(val -> System.out.println("distinct val = " + val));

    }
}
