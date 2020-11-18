package work_1;

public class MyClass<T> {

    public static <T> void factoryMethod(T t1) {
        System.out.println(t1.toString());
    }

    public static void main(String[] args) {
        factoryMethod(new Double(3.14));
    }
}
