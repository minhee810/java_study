package ch08;

public class Ex8_7 {
    public static void main(String[] args) {
        try { // Exception 과 그 자손은 반드시 예외처리를 해줘야 한다. (필수)
            throw new Exception(); // Exception 을 고의로 발생시킨다.

        } catch (Exception e) {

            System.out.println("예외 처리 완료");

            // RuntimeException 과 그 자손은 예외 처리를 해주지 않아도 컴파일이 된다. (선택)
            throw new RuntimeException();
        }
    }
}
