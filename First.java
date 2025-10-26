interface A {
    void func();

    default void display() {
        System.out.println("This is a display method");

    }
}

class B implements A {
    @Override
    public void func() {
        System.out.println("This is func from B");
    }

    void uniqueBMethod() {
        System.out.println("This is a unique method in B");
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
        a.func();
        a.display();
        ((B) a).uniqueBMethod();
        ((C) a).val = "c";// use typecasting to access child methods+data
        System.out.println(((C) a).val);
        B b = new C();
        b.func();
        b.display();
        b.uniqueBMethod();
        ((C) b).uniqueCMethod();

    }
}