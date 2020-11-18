package Work_2;

public class Car {
    public int god;
    public String cvet;

    public Car() {
        this.cvet = "green";
        this.god = 20;
    }

    public Car(int god) {
        this.god = god;
        this.cvet = "blue";
    }

    public Car(int god, String cvet) {
        this.god = god;
        this.cvet = cvet;
    }
}
