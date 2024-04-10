package ch13;

public class Ex13_1 {
    public static void main(String[] args) {

        ThreadEx1_1 t1 = new ThreadEx1_1();

        Runnable runnable = new ThreadEx1_2();
        Thread t2 = new Thread(runnable); // 생성자 Thread(Runnable target)

        t1.start();
        t2.start();

    }
}

class ThreadEx1_1 extends Thread { // 1. 쓰레드 클래스를 상속하여 스레드를 구현

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            System.out.println("getName() = " + getName());
        }
    }
}

class ThreadEx1_2 implements Runnable{  // 2. Runnable 인터페이스를 구현받아 스레드를 구현
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName()); // 현재 실행중인 스레드의 이름을 반환
        }
    }
}


