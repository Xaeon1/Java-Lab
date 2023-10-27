package shapes;

import java.util.Scanner;

public class Rectangle extends Shape{

    private double b;
    Scanner scan = new Scanner(System.in);

    @Override
    public double area(double a) {
        b = scan.nextDouble();
        return a * b;
    }

    @Override
    public double perimeter(double a) {
        b = scan.nextDouble();
        return 2 * ( a + b );
    }
}
