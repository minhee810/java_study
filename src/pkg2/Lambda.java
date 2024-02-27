package pkg2;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("public");
        list.add("static");
        list.add("void");

        // for 문으로 List 를 순회할 수 있다.
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list = " + list.get(i)); // i번째 요소가 출력된다.
        }

        list.stream().forEach(str -> System.out.println("str = " + str));
    }

}
