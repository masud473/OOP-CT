//create classes like apple orange and their catagories that inherit from fruit
abstract class FruitBase {
    String name;
    String color;

    FruitBase(String name, String color) {
        this.name = name;
        this.color = color;
    }

    abstract void displayInfo();
}

interface Edible {
    void eat();
}

class Apple extends FruitBase implements Edible {
    String type;

    Apple(String name, String color, String type) {
        super(name, color);
        this.type = type;
    }

    @Override
    void displayInfo() {
        System.out.println("Name: " + name + ", Color: " + color + ", Type: " + type);
    }

    @Override
    public void eat() {
        System.out.println("Eating a " + type + " " + name);
    }
}

class Orange extends FruitBase implements Edible {
    String variety;

    Orange(String name, String color, String variety) {
        super(name, color);
        this.variety = variety;
    }

    @Override
    void displayInfo() {
        System.out.println("Name: " + name + ", Color: " + color + ", Variety: " + variety);
    }

    @Override
    public void eat() {
        System.out.println("Eating a " + variety + " " + name);
    }
}

class GreenApple extends Apple {
    GreenApple(String name, String color, String type) {
        super(name, color, type);
    }

    @Override
    void displayInfo() {
        System.out.println("This is a Green Apple. Name: " + name + ", Color: " + color + ", Type: " + type);
    }
}

class RedApple extends Apple {
    RedApple(String name, String color, String type) {
        super(name, color, type);
    }

    @Override
    void displayInfo() {
        System.out.println("This is a Red Apple. Name: " + name + ", Color: " + color + ", Type: " + type);
    }
}

class Fruit {
    public static void main(String[] args) {
        FruitBase e = new GreenApple("GreenApple", "red", "Sweet");
        ((GreenApple) e).displayInfo();

    }
}