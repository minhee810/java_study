package ch13;

public class Ex13_11 {
    static long startTime = 0;

    public static void main(String[] args) {

        ThreadEx11_1 th1 = new ThreadEx11_1();
        ThreadEx11_2 th2 = new ThreadEx11_2();

        th1.start();
        th2.start();

        startTime = System.currentTimeMillis();

        try {
            // join() : 다른 쓰레드가 하는 일을 기다린다.
            th1.join();  // main 쓰레드가 th1의 작업이 끝날때까지 기다린다.
            th2.join();  // main 쓰레드가 th2의 작업이 끝날때까지 기다린다.

        }catch (InterruptedException e){

        }
        System.out.println("소요시간 : " + (System.currentTimeMillis() - startTime));

    }
}
class ThreadEx11_1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {

            System.out.print(new String("-"));
        }
    }
}

class ThreadEx11_2 extends Thread{  // 2. Runnable 인터페이스를 구현받아 스레드를 구현
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println(new String("|"));

        }
    }
}