package Work_1;

import java.security.PublicKey;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw () {
        System.out.println("Коло");
    }
}

class Rectangle extends Shape {
    @Override
    void draw () {
        System.out.println("Прямокутник");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();
    }
}
