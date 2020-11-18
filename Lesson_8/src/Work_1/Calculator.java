package Work_1;

import java.util.Scanner;

public class Calculator {


    int add(int a, int b) {
        return a + b;
    }
    int sub(int a, int b) {
        return a - b;
    }
    int mul (int a, int b) {
        return a * b;
    }
    int div (int a, int b) {

        try {
            a = a / b;
        } catch (Exception e) {
            System.out.println("Ділення на 0!");
            System.out.println(e.getMessage());
        }
        return a / b;
    }
}

class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число 1: ");
        int a = sc.nextInt();
        System.out.println("Задайте дію: ");
        String diya = sc.next();
        System.out.print("Введіть число 2: ");
        int b = sc.nextInt();

        if (diya.equals("+")) {
            System.out.println(calculator.add(a, b));
        } if (diya.equals("-")) {
            System.out.println(calculator.sub(a, b));
        } if (diya.equals("*")) {
            System.out.println(calculator.mul(a, b));
        } if (diya.equals("/")) {
            System.out.println(calculator.div(a, b));
        }

    }
}
