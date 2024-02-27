package pkg2;

class Time {

    private int hour;
    private int min;
    private int sec;


    public int getHour() {
        return hour;
    }


    public void setHour(int hour) {
        if (isaBoolean(hour)) {
                return ;
        }
        this.hour = hour;
    }

    // 매개변수로 넘겨진 hour 가 유효한지 확인하는 메서드 : private 로 선언 밖에서 사용하지 않는 메서드이기 때문
    private static boolean isaBoolean(int hour) {
        return hour < 0 || hour > 23;
    }

}

public class TimeTest{

    public static void main(String[] args) {
        Time time = new Time();

//        time.setHour(21);
        time.setHour(55);

        int hour = time.getHour();

        System.out.println("hour = " + hour);
    }
}
