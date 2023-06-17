package task_01.rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create scanner for reception data in user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of side1, then press 'Return', and enter side2, press 'Return' again");

        //create a class instance and pass data
        Rectangle rectangle = new Rectangle(sc.nextDouble(), sc.nextDouble());
        //answer
        System.out.println("Area = " + rectangle.areaCalculator() + "\nPerimetr = " + rectangle.perimetrCalculator());


    }
}
