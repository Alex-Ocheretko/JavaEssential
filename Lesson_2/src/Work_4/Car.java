package Work_4;

public class Car {
    public int year;
    public double speed;
    public int weight;
    public String color;

    public Car() {
        year = 1;
        speed = 11.1;
        weight = 100;
        color = "red";
        }
    public Car( int year){
        this.year = year;
        this.speed = 22.2;
        this.weight = 200;
        this.color = "green";
    }
    public Car( int year, double speed){
        this(year);
        this.speed = speed;
        this.weight = 300;
        this.color = "blue";
    }
    public Car( int year, double speed, int weight){
        this(year, speed);
        this.weight = weight;
        this.color = "yellow";
    }
    public Car( int year, double speed, int weight, String color){
        this(year, speed, weight);
        this.color = color;
    }
}
