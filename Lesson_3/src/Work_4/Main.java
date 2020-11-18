package Work_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte pro = 1;
        byte exp = 2;

        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextByte();

        if (key == pro) {
            ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
            proDocumentWorker.openDocument();
            proDocumentWorker.editDocument();
            proDocumentWorker.saveDocument();
        }
        else if (key == exp) {
            ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
            expertDocumentWorker.openDocument();
            expertDocumentWorker.editDocument();
            expertDocumentWorker.saveDocument();
        } else {
            DocumentWorker documentWorker = new DocumentWorker();
            documentWorker.openDocument();
            documentWorker.editDocument();
            documentWorker.saveDocument();
        }
    }
}