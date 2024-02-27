package pkg2;

import pkg1.MyParent;

class MyChild extends MyParent {

    public void printMembers() {
        System.out.println(pub);
        System.out.println(ptd);
//        System.out.println(dft); // 에러 : 다른 패키지에서 접근 불가능
//        System.out.println(prt); // 에러 : 다른 클래스, 패키지에서 접근 불가능
    }
}

public class MyParentTest2 {

    public static void main(String[] args) {

        MyParent mp = new MyParent();
        System.out.println(mp.pub);
//        System.out.println(mp.ptd);   // 에러
//        System.out.println(mp.dft);   // 에러
//        System.out.println(mp.prt);   // 에러 : 같은 클래스가 아니므로 에러 발생
    }

}
