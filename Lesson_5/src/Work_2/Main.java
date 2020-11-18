package Work_2;

import java.util.ArrayList;

class Zoo {
    ArrayList<String> arrayList = new ArrayList<>();


}

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.arrayList.add(0,"Слон");
        zoo.arrayList.add(1,"Півень");
        zoo.arrayList.add(2,"Ішак");
        zoo.arrayList.add(3,"Змія");
        zoo.arrayList.add(4,"Бик");
        zoo.arrayList.add(5,"Карась");
        zoo.arrayList.add(6,"Мавпа");

        zoo.arrayList.remove(6);
        zoo.arrayList.remove(4);
        zoo.arrayList.remove(2);


        System.out.println(zoo.arrayList.size());
        System.out.println(zoo.arrayList);
    }
}
