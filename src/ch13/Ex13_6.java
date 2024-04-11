package ch13;

public class Ex13_6 {
    public static void main(String[] args) {

        ThreadEx6_1 th1 = new ThreadEx6_1();
        ThreadEx6_2 th2 = new ThreadEx6_2();

        th1.setPriority(5);
        th2.setPriority(7);

        System.out.println("Priority of th(-) : " + th1.getPriority());
        System.out.println("Priority of th(|) : " + th2.getPriority());

        th1.start();
        th2.start();
    }
}


class ThreadEx6_1 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
            for (int j = 0; j < 10000000; j++) {
                
            }
        }
    }
}

class ThreadEx6_2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
            for (int j = 0; j <10000000; j++) {

            }
        }
    }
}