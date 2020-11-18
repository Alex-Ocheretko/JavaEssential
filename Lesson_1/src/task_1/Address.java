package task_1;

public class Address {
    public int index;
    public int country;
    public int city;
    public int street;
    public int house;
    public int apartment;

    public Address() {}

    public Address(int index, int country, int city, int street, int house, int apartment) {
        this.index = index;
        this.apartment = apartment;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public void setStreet(int street) {
        this.street = street;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public int getIndex() {
        return index;
    }

    public int getCountry() {
        return country;
    }

    public int getCity() {
        return city;
    }

    public int getStreet() {
        return street;
    }

    public int getHouse() {
        return house;
    }

    public int getApartment() {
        return apartment;
    }

}