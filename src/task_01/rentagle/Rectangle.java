package task_01.rentagle;

public class Rectangle {

    //fields
    double side1, side2;

    //constructors
    public Rectangle() {
    }

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
    //methods

    public double areaCalculator () {
        return side1 * side2;
    }
    public double perimetrCalculator () {
        return 2 * (side1+side2);

    }
}

