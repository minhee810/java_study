package ch13;

import javax.swing.*;
// 싱글스레드
public class Ex13_4 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
        System.out.println("입력하신 값은 " + input + "입니다. ");

        for (int i = 10; i > 0; i--) {
            System.out.println("i = " + i);

            try {
                Thread.sleep(1000); // 1초의 시간을 지연

            } catch (Exception e) {

            }
            
        }

    }
}
