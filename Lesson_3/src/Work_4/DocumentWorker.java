package Work_4;

public class DocumentWorker {

    public void openDocument() {
        System.out.println("Документ відкритий");
    }
    public void editDocument() {
        System.out.println("Редагування доступне у версії ПРО");
    }
    public void saveDocument() {
        System.out.println("Збереження документу доступно у версії Про.");
    }
}

class ProDocumentWorker extends DocumentWorker {
    @Override
    public void editDocument() {
        System.out.println("Документ відредаговано");
    }

    @Override
    public void saveDocument() {
        System.out.println("Документ збережено у старому форматі, збереження і інших форматах доступне у версії Експерт.");
    }
}

class ExpertDocumentWorker extends ProDocumentWorker{
    @Override
    public void saveDocument() {
        System.out.println("Документ збережений у новому форматі");
    }
}