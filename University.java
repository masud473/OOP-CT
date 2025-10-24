interface Shape {
    Double pi = 3.1416;

    Double area();
}

abstract class CircleBase {
    Double radius;

    CircleBase(Double val) {
        radius = val;
    }

    abstract void display();
}

class Circle extends CircleBase implements Shape {
    @Override
    public Double area() {
        return pi * radius * radius;
    }

    Circle(Double val) {
        super(val);
    }

    @Override
    public void display() {
        System.out.println(radius + " " + area());
    }
}

class University {
    public static void main(String[] args) {

       Shape s=new Circle(5.0);// double means 5.0 not 5
       ((Circle)s).display();

    }
}
