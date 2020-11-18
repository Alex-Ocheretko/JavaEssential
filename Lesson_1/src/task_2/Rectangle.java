package task_2;

public class Rectangle {

    public double side1;
    public double side2;


    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double areaCalculator(double side1, double side2) {
        double area = side1 * side2;
        return area;
    }

    public double perimeterCalculator (double side1,double side2) {
        double perimetr = 2 * (side1 + side2);
        return perimetr;
    }
}