package ch08;

class MyException extends Exception{

    // 에러코드 값을 저장하기 위한 필드 추가
    private final int ERR_CODE; // 생성자를 통해 초기화 한다.

    MyException(String msg, int err_code) {
        super(msg);
        ERR_CODE = err_code;
    }

    MyException(String msg) {     // 생성자
        this(msg, 100);     // ERR_CODE 를 100(기본값)으로 초기화 한다.
    }

    public int getERR_CODE() {  // 에러코드를 얻을 수 있는 메서드도 추가했다.
        return ERR_CODE;    // 이 메서드는 주로 getMessage()와 함께 사용될 것이다.
    }

}


public class Ex8_11 {
}
