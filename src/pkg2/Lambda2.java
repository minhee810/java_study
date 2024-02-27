package pkg2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda2 {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list = Arrays.asList(integers);

//        List evenList = new ArrayList<Integer>();

//        for (int i = 0; i < list.size() ; i++) {
//            Integer number = list.get(i);
//            if (number % 2 == 0) {
//                evenList.add(number);
//            }
//        }
//
//        for (int i = 0; i < evenList.size(); i++) {
//            System.out.println("evenList = " + evenList.get(i));
//        }



        List evenList = list.stream()
                .filter(value-> value % 2 == 0).collect(Collectors.toList());

        evenList.stream().forEach(value -> System.out.println("value = " + value));


    }
}
