package ch09;

public class Ex9_10 {
    public static void main(String[] args) {
        int iVal = 100;
//        String strVal = String.valueOf(100);
        String strVal = iVal + "";
        
        double dVal = 200.0;
        String strVal2 = String.valueOf(dVal);
        
        double sum = Integer.valueOf("+"+strVal) + Double.valueOf(strVal2);
        double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);


        
    }
}
