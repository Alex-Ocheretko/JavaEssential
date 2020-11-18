package Work_2;


import java.util.Scanner;

abstract class AbstractHandler{
   abstract void open ();
   abstract void create ();
   abstract void change ();
   abstract void save ();
}

class XMLHandler extends AbstractHandler {
    void open (){
        System.out.println("xml.open");
    }
    void create (){
        System.out.println("xml.create");
    }
    void change () {
        System.out.println("xml.hange");
    }
    void save () {
        System.out.println("xml.save");
    }
}
class TXTHandler extends AbstractHandler {
    void open (){
        System.out.println("txt.open");
    }
    void create (){
        System.out.println("txt.create");
    }
    void change () {
        System.out.println("txt.change");
    }
    void save () {
        System.out.println("txt.save");
    }
}
class DOCHandler extends AbstractHandler {
    void open (){
        System.out.println("doc.open");
    }
    void create (){
        System.out.println("doc.create");
    }
    void change () {
        System.out.println("doc.change");
    }
    void save () {
        System.out.println("doc.save");
    }
}




public class Main {
    public static void main(String[] args) {

        AbstractHandler xml = new XMLHandler();
        AbstractHandler txt = new TXTHandler();
        AbstractHandler doc = new DOCHandler();

            xml.open();
            xml.create();
            xml.change();
            xml.save();

            txt.open();
            txt.create();
            txt.change();
            txt.save();

            doc.open();
            doc.create();
            doc.change();
            doc.save();
    }
}