package pkg1;

public class MyParent {

    public int pub;
    protected int ptd;
    int dft;
    private int prt;

    public void printMembers() {
        System.out.println(pub);
        System.out.println(ptd);
        System.out.println(dft);
        System.out.println(prt);
    }
}

class MyParentTest {
    public static void main(String[] args) {
        MyParent mp = new MyParent();
        System.out.println(mp.pub);
        System.out.println(mp.ptd);
        System.out.println(mp.dft);
//        System.out.println(mp.prt);   // 에러 : 같은 클래스가 아니므로 에러 발생

    }
}
