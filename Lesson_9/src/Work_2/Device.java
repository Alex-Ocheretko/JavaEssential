package Work_2;

public class Device {
   private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

}

class Monitor extends Device{
    int resolutionX;
    int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor{" + "manufacturer = " + getManufacturer() + ", price = " + getPrice() + ", serial number = " + getSerialNumber() +
                ", resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY +
                '}';
    }
}

class EthernetAdapter extends Device {
    int speed;
    String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public String toString() {
        return "EthernetAdapter{"+ "manufacturer = " + getManufacturer() + ", price = " + getPrice() + ", serial number = " + getSerialNumber() +
                ", speed=" + speed +
                ", mac='" + mac + '\'' +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Device monitor = new Monitor("Samsung", 120, "AB123456CD", 1920, 1080);
        Device ethernetAdapter = new EthernetAdapter("UFO", 50, "DC987654BA", 200, "asefaef2dwq");

        System.out.println(monitor.toString());
        System.out.println(ethernetAdapter);
    }
}