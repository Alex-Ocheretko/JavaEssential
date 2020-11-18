package Work_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Car car1 = new Car(1);
        Car car2= new Car(15, "red");

        System.out.println(car.god + car.cvet);
        System.out.println(car1.god + car1.cvet);
        System.out.println(car2.god + car2.cvet);
    }
}
