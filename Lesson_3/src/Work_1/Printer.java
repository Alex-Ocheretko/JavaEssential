package Work_1;

public class Printer {

    public String ANSI_RESET = "\u001B[0m";
    public String ANSI_GREEN = "\u001B[32m";
    public String ANSI_BLUE = "\u001B[34m";
    public String ANSI_RED = "\u001B[31m";

    void print (String value) {
        System.out.println(ANSI_RED + value);
        System.out.println(ANSI_GREEN + value);
        System.out.println(ANSI_BLUE + value);
        System.out.println(ANSI_RESET);
    }
}