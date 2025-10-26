abstract class A {
    abstract void func();

    void display() {
        System.out.println("This is a display method");

    }
}

class B extends A {
    @Override
    void func() {
        System.out.println("This is func from B");
    }
}

class C extends B {
    @Override
    void func() {
        System.out.println("This is func from C");
    }

    void uniqueCMethod() {
        System.out.println("This is a unique method in C");
    }

}

public class First {
    public static void main(String[] args) {
        A a = new C();
        a.func();
        a.display();
        ((C)a).uniqueCMethod();// use typecasting to access child methods
    }
}