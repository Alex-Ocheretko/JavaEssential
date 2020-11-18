package Work_2;

class Vehicle{
    void print(){}

    static class Wheel extends Vehicle{
        void print(){
            System.out.println("Wheel!");
        }
    }

    static class Door extends Vehicle{
        void print(){
            System.out.println("Door!");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Vehicle.Wheel wheel = new Vehicle.Wheel();
        Vehicle.Door door = new Vehicle.Door();

        wheel.print();
        door.print();
    }
}
