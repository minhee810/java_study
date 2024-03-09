package ch10;

import java.util.Calendar;

public class Ex10_1 {

    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.clear();
        date.set(2024, 4, 9);

        // add()
        date.add(Calendar.DATE, 1); // DATE(날짜)에 1을 더한다.
        date.add(Calendar.MONTH, -8); // 월(MONTH) 에서 8을 뺀다.

        // roll()
        date.set(2024, 7, 31);

        // add() 와 달리 roll() 은 다른 필드에 영향을 미치지 않는다.
        date.roll(Calendar.DATE, 1);
        date.roll(Calendar.MONTH, -8);

    }

}
