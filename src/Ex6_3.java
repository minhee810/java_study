import java.util.Random;
import java.util.stream.IntStream;

final class Ex6_3 {

    final int MAX_SIZE = 10;

    final void getMaxSize() {
        final int LV = MAX_SIZE;
    }
    public static void main(String[] args) {

        IntStream intStream = new Random().ints(5  ); // 무한 스트림
//        intStream.limit(5).forEach(System.out::println);
        intStream.forEach(System.out::println);

    }
}
