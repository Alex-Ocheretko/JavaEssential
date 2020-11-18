package Work_1;

enum Venicles {

        PORSH(100, "red" ), ZAPOR(200, "green"), CHERI(300, "red");

    public int price;
    public String color;

    Venicles(int price, String color) { this.price = price; this.color = color; }

    public String getColor () {
        return color;
    }

    @Override
    public String toString() {
        return this.name() + " price = " + price + " color = " + this.getColor();
    }
}


class Main {
    public static void main(String[] args) {


        Venicles cheri = Venicles.CHERI;{
            System.out.println(cheri.toString());
        }

        Venicles zapor = Venicles.ZAPOR; {
            System.out.println(zapor.toString());

        }

        Venicles porsh = Venicles.PORSH; {
            System.out.println(porsh.toString());
        }

    }
}