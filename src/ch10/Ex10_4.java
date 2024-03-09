package ch10;

import java.util.Calendar;

public class Ex10_4 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.set(2022, 4, 10);

        System.out.println(toString(date));
        System.out.println("= 1일 후 =");
        date.add(Calendar.DATE, 1);
        System.out.println(toString(date));


        System.out.println("= 6달 전 =");
        date.add(Calendar.MONTH, -6);
        System.out.println(toString(date));

        // add()와 달리 다른 필드에 영향을 주지 않기 때문에 일 수만 올라가고 월은 증가하지 않음.
        System.out.println("= 31일 후 (roll) =");
        date.roll(Calendar.DATE, 31);
        System.out.println(toString(date));

        // 하지만, add() 는 다른 필드에 영향을 주는 메서드이기 때문에 월 수까지 증가하는 것을 발견할 수 있음.
        System.out.println("= 31일 후 (add) =");
        date.add(Calendar.DATE, 31);
        System.out.println(toString(date));

    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년" + (date.get(Calendar.MONTH)) + "월" + date.get(Calendar.DATE) + "일";

    }
}
