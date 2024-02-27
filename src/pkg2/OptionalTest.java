package pkg2;

public class OptionalTest{
    private static String getSomeString(){
        return null;  // 이 메서드는 항상 null 을 반환한다.
        // optional 은 null 이 들어았는 레퍼런스 변수의 멤버에 접근하려고 할 때 발생하는 예외인 NullPointException 을 우아하게 해결하기 위해 등장
    }

    public static void main(String[] args) {
        String isThisNull = getSomeString();

        System.out.println(isThisNull.toUpperCase());

//        if (null != isThisNull) {
//            System.out.println(isThisNull.toUpperCase());
//        }


    }
}
