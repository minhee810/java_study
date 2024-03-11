package ch11;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {
    public static void main(String[] args) {
        // 기본길이 (용량, Capacity) 가 10인 ArrayList 를 생성
        ArrayList list1 = new ArrayList(10);

        // ArrayList 는 객체만 저장 가능
        // autoboxing 에 의해 기본형이 참조형으로 저장됨.
        list1.add(Integer.valueOf(5));
        list1.add(Integer.valueOf(4));
        list1.add(Integer.valueOf(2));
        list1.add(Integer.valueOf(0));
        list1.add(Integer.valueOf(1));
        list1.add(Integer.valueOf(3));

        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        print(list1, list2);

        // Collection 은 인터페이스, Collections 는 유틸 클래스
        Collections.sort(list1);
        Collections.sort(list2); // Collections.sort(List list)

        print(list1, list2);

        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));  // list2 의 모든 요소를 list1 이 포함하고 있는지 확인

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        print(list1, list2);


        list2.set(3, "AA");
        print(list1, list2);

        list1.add(0, "1");
        print(list1, list2);
        System.out.println("list1.indexOf(\"1\") : " + list1.indexOf("1"));
        System.out.println("list1.indexOf(1) : " + list1.indexOf(Integer.valueOf(1)));

        list1.remove(1); // index 가 1인 객체를 삭제함. 따라서 integer 1 을 지우고 싶다면
        list1.remove(Integer.valueOf(1)); // 다음과 같이 메서드를 호출해야한다.

        print(list1, list2);

        // list1 에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));

        print(list1, list2);

        // list2에서 list1에 포함된 객체들을 삭제한다.
        for (int i = list2.size() - 1; i >= 0; i--) {
            if (list1.contains(list2.get(i))) {
                list2.remove(i);
            }
            print(list1, list2);
        }
    }// main () 의 끝

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println();
    }
}
