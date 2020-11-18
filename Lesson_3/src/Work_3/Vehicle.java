package Work_3;

import javax.sound.midi.Soundbank;

public class Vehicle {
    public int price;
    public int speed;
    public int yearOfCreation;

    Vehicle() {
        this.price = 2000;
        this.speed = 300;
        this.yearOfCreation = 2020;
    }
}


class Plane extends Vehicle{

    public int height = 2000;
    public int passengers = 2;

    @Override
    public String toString(){
        return ("price: " + price + "; speed: " + speed + "; year of creation: " + yearOfCreation + "; height: " + height + "; passengers: " + passengers);
    }

}

class Car extends Vehicle{
    @Override
    public String toString(){
        return ("price: " + price + "; speed: " + speed + "; year of creation: " + yearOfCreation);
    }
}

class Ship extends Vehicle{
    public int passengers = 20;
    public String port = "Ukraine, Kyiv, 05222";

    @Override
    public String toString() {
        return ("price: " + price + "; speed: " + speed + "; year of creation: " + yearOfCreation + "; port: " + port + "; passengers: " + passengers);
    }
}