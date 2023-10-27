package shape;

public class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor for Triangle
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        calculateArea();
        calculateCircumference();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        area=0.5 * base * height;
        return area;
    }

    @Override
    public double calculateCircumference() {
        circumference=-1;
        return circumference;
    }
}
