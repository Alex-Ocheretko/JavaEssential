package Work_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        double speed = sc.nextDouble();
        int weight = sc.nextInt();
        String color = sc.next();

        Car car = new Car();
        Car car1 = new Car(year);
        Car car2 = new Car(year, speed);
        Car car3 = new Car(year, speed, weight);
        Car car4 = new Car(year, speed, weight, color);

        System.out.println(car.year +" "+ car.speed +" "+ car.weight +" "+ car.color);
        System.out.println(car1.year +" "+ car1.speed +" "+ car1.weight +" "+ car1.color);
        System.out.println(car2.year +" "+ car2.speed +" "+ car2.weight +" "+ car2.color);
        System.out.println(car3.year +" "+ car3.speed +" "+ car3.weight +" "+ car3.color);
        System.out.println(car4.year +" "+ car4.speed +" "+ car4.weight +" "+ car4.color);


    }
}
