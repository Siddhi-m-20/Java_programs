package shape;

public class Circle extends Shape {
    private double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
        calculateArea();
        calculateCircumference();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        setArea(Math.PI * radius * radius);
        return area;
    }

    @Override
    public double calculateCircumference() {
        setCircumference(2 * Math.PI * radius);
        return circumference;
    }
}