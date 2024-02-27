package pkg2;

public class Time {

    private int hour;
    private int min;
    private int sec;


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
                return ;
        }
        this.hour = hour;
    }
}
