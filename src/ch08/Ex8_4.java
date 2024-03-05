package ch08;

class Ex8_4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(args[0]); // 예외 발생 -> 예외 객체 생성
            System.out.println(0 / 0);   // 예외 발생
            System.out.println(4);       // 실행되지 않는다.
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("예외 메시지 : " + e.getMessage());
            System.out.println("ArrayIndexOutOfBoundsException");

        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException) System.out.println("true");
            System.out.println("ArithmeticException");

        } catch (Exception e) {     // 모든 예외의 최고 조상 -> 모든 예외 처리 가능
            System.out.println("Exception");
        }
        System.out.println(6);

    }

}
