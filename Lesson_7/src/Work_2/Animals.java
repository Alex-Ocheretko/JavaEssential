package Work_2;

public enum Animals {

    RABBIT(2), COW(15), CHICKEN(3), ZEBRA(40);

    int age;

    Animals(int age) { this.age = age; }

    @Override
    public String toString() {
        return this.name() + " age = " + this.age;
    }
}
class Main {
    public static void main(String[] args) {
        Animals animals = null;

        System.out.println(animals.RABBIT.toString());
        System.out.println(animals.COW.toString());
        System.out.println(animals.CHICKEN.toString());
        System.out.println(animals.ZEBRA.toString());
    }
}