interface A {
    void func();

<<<<<<< HEAD
    static void printStatic() {
        System.out.println("This is a static method in interface A");
    }

=======
>>>>>>> c54e87c6cfca013cc6bf477b0f89161cc87d1874
    default void display() {
        System.out.println("This is a display method");

    }
}

<<<<<<< HEAD
abstract class A1 {
    abstract void func2();

}

class B extends A1 implements A {
=======
class B implements A {
>>>>>>> c54e87c6cfca013cc6bf477b0f89161cc87d1874
    @Override
    public void func() {
        System.out.println("This is func from B");
    }

    void uniqueBMethod() {
        System.out.println("This is a unique method in B");
    }

<<<<<<< HEAD
    @Override
    public void func2() {
        System.out.println("This is func2 from B");
    }

=======
>>>>>>> c54e87c6cfca013cc6bf477b0f89161cc87d1874
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
<<<<<<< HEAD
        ((C) a).uniqueBMethod();
        ((C) a).val = "c";// use typecasting to access child methods+data
        ((C) a).func2();
=======
        ((B) a).uniqueBMethod();
        ((C) a).val = "c";// use typecasting to access child methods+data
>>>>>>> c54e87c6cfca013cc6bf477b0f89161cc87d1874
        System.out.println(((C) a).val);
        B b = new C();
        b.func();
        b.display();
        b.uniqueBMethod();
        ((C) b).uniqueCMethod();

    }
}