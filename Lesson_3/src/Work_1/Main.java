package Work_1;

import java.util.Scanner;

public class Main extends Printer{

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String value = scr.nextLine();
        Printer pr = new Main();
        pr.print(value);
    }
}