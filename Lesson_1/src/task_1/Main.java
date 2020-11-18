package task_1;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        address.setIndex(0);
        address.setCountry(1);
        address.setCity(2);
        address.setStreet(3);
        address.setHouse(4);
        address.setApartment(5);

        System.out.println(address.getIndex());
        System.out.println(address.getCountry());
        System.out.println(address.getCity());
        System.out.println(address.getStreet());
        System.out.println(address.getHouse());
        System.out.println(address.getApartment());
    }
}
