
class A {
    int i = 10;
    void  m1(){
        System.out.println("m1");
    }
}

class B extends A{
    void m2(){
        System.out.println("m2");
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.i);
        a.m1();
        B b = new B();
        b.m1();
        b.m2();
        b.i=101;
        System.out.println(b.i);
    }
}
