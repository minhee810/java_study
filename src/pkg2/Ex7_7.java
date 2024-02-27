package pkg2;

public class Ex7_7 {
    public static void main(String[] args) {

        Car car = new Car();
//        FireEngine fe = (FireEngine) car; // 형변환 실행 에러 : java.lang.ClassCastException
//        fe.water(); // 컴파일 OK! But, 실행 시 에러 발생


    }
}


class Car{
    String color;
    int door;

    void drive() {
        System.out.println("drive, brrr ~");
    }

    void stop() {
        System.out.println("stop !!! ");
    }
}
class FireEngine extends Car{
    void water() {
        System.out.println("water !!! ");
    }
}