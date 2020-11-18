package task_3;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Title ttl = new Title();
        Author aut = new Author();
        Content con = new Content();

        System.out.println("Введіть назву книжкм: ");
        ttl.setTitle(sc.next());
        System.out.println("Введіть Автора: ");
        aut.setAuthor(sc.next());
        System.out.println("Введіть зміст: ");
        con.setContent(sc.next());

        ttl.show();
        aut.show();
        con.show();
    }
}
