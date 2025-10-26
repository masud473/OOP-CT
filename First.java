interface A {
    void func();

    static void printStatic() {
        System.out.println("This is a static method in interface A");
    }

    default void display() {
        System.out.println("This is a display method");

    }
}

abstract class A1 {
    abstract void func2();

}

class B extends A1 implements A {
    @Override
    public void func() {
        System.out.println("This is func from B");
    }

    void uniqueBMethod() {
        System.out.println("This is a unique method in B");
    }

    @Override
    public void func2() {
        System.out.println("This is func2 from B");
    }

}

class C extends B {
    String val;

    @Override
    public void func() {
        System.out.println("This is func from C");
    }

    void uniqueCMethod() {
        System.out.println("This is a unique method in C");
    }

}

public class First {
    public static void main(String[] args) {
        A a = new C();
        A.printStatic();
        a.func();
        a.display();
        ((C) a).uniqueBMethod();
        ((C) a).val = "c";// use typecasting to access child methods+data
        ((C) a).func2();
        System.out.println(((C) a).val);
        B b = new C();
        b.func();
        b.display();
        b.uniqueBMethod();
        ((C) b).uniqueCMethod();

    }
}