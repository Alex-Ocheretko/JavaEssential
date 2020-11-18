package task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner scr = new Scanner(System.in);

        System.out.println("Введіть довжину першої сторони");
        rectangle.setSide1(scr.nextDouble());
        System.out.println("Введіть довжину другої сторони");
        rectangle.setSide2(scr.nextDouble());

        System.out.println("Площа = " + rectangle.areaCalculator(rectangle.side1, rectangle.side2));
        System.out.println("Периметер = " + rectangle.perimeterCalculator(rectangle.side1, rectangle.side2));
    }
}
