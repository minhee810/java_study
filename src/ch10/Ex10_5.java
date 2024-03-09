package ch10;

import java.util.Calendar;
import java.util.Date;

public class Ex10_5 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage : java Ex10_5 2024 3");
            return;
        }

        int year = 2024;
        int month = 3;
        int START_DAY_OF_WEEK = 0; // 1일의 요일
        int END_DAY = 0;

        Calendar sDay = Calendar.getInstance(); // start day
        Calendar eDay = Calendar.getInstance(); // end day

        // 월의 경우 0부터 11까지의 값을 가지므로 1을 빼주어야 한다.
        // 예를 들어, 2019년 11월 1일은 sDay.set(2019, 10, 1); 과 같이 해주어야 한다.
        sDay.set(year, month - 1, 1);
        eDay.set(year, month, 1);

        // 다음달의 첫날에서 1일을 빼면 현재 달의 마지막날을 구할 수 있다.
        eDay.add(Calendar.DATE, -1);

        // 첫번째 요일이 무슨 요일인지 알아낸다.
        START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);

        // eDay 에 지정된 날짜를 얻어온다.
        END_DAY = eDay.get(Calendar.DATE);

        System.out.println("       " + year + "년" + month + "월");
        System.out.println(" SU  MO  TU  WE  TH  FR  SA");

        // 해당 월의 1일이 어느 요일인지에 따라서 공백을 출력한다.
        // 만일 1일이 수요일이라면 공백을 세번 찍는다. (일요일부터 시작)
        for (int i = 1; i < START_DAY_OF_WEEK; i++)
            System.out.println("   ");


//        for (int i = 1, n < START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
//            System.out.println(1 < 10 ? "  " + i : i);
//            if (n%7==0) System.out.println();
//        }

        for (int i = 1; i < START_DAY_OF_WEEK; i++) {
            System.out.println((i<10? "  " : "  ") + i);
            if ((i + START_DAY_OF_WEEK -1) % 7 == 0)
                System.out.println();
        }

        // 1. Calender 를 Date 로 변환
        Calendar cal = Calendar.getInstance();
        Date d = new Date(cal.getTimeInMillis()); // Date(long date) // getTimeInMillis()

        // 2. Date 를 Calender 로 변환
        Calendar cal2 = Calendar.getInstance(); // setTime
        cal.setTime(d);
    }
}
