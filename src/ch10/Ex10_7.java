package ch10;

import java.text.DecimalFormat;
import java.util.zip.DeflaterInputStream;

public class Ex10_7 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.##"); // 1,234,567.89
        DecimalFormat df2 = new DecimalFormat("#.###E0");

        try {
            System.out.println(Double.parseDouble("1234567.89")); // 콤마를 지우면 에러가 발생하지 않음.
            Number num = df.parse("1,234,567.89"); // 숫자 형태의 문자열을  parse () 를 사용해서 double 타입의 숫자 형태로 바꿈.
            System.out.println("1,234,567.89" + " -> ");

            double d = num.doubleValue();
            System.out.print(d + " -> ");

            System.out.println(df2.format(num));  // 1.234E6

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    // parse(String text) : 문자열을 숫자로 파싱하여 해당 "숫자값"을  -> 숫자
    // format(double number) : 숫자를 지정된 형식의 "문자열"로 포맷팅 -> 문자
}
