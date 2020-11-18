package Work_3;

import java.util.Scanner;

class Distance {
    double distance;
    void print() {}

    static class Converter {
        static void convIN(double distance){
            System.out.println("Дюймів: " + distance * 39.3700787);
        }
        static void convFT(double distance){
            System.out.println("Футів: " + distance * 0.3048);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.print("Задайте відстань в метрах: ");
        Scanner sc = new Scanner(System.in);
        double distance = sc.nextDouble();

        Distance.Converter.convFT(distance);
        Distance.Converter.convIN(distance);




    }
}