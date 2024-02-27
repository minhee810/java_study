package pkg2;

class A{
    public void method(I i) {
        i.method();
    }
}

// B 클래스의 선언부만 작성
interface I{
    void method();
        }

class B implements I{
    public void method() {
        System.out.println("B 클래스의 method 호출");
    }
}

class C implements I{
    public void method() {
        System.out.println("C 클래스의 method 호출");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.method(new C());
    }
}
