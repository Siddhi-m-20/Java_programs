package shape;

public class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor for Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        calculateArea();
        calculateCircumference();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        setArea(length * width);
        return area;
    }

    @Override
    public double calculateCircumference() {
        setCircumference(2 * (length + width));
        return circumference;
    }
}
