package shapes;

public class Circle extends Shape{

    @Override
    public double area(double r) {
        return Math.pow(r, 2)*Math.PI;
    }

    @Override
    public double perimeter(double r) {
        return 2 * r * Math.PI;
    }
}
