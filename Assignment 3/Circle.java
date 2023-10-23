/**
 * Write a Java Program that creates a class circle with instance variable for the radius.
 *  Write a default and parameterised constructor. Write a method to display area of a circle.
 *  Use Javadoc.
 */
/**
 * This is a circle class that represents a circle with a given radius.
 */
public class Circle {
    private double radius;

    /**
     * This is a default constructor that initializes the radius to 1.0.
     */
    public Circle() {
        this.radius = 1.0;
    }

    /**
     * This is a Parameterized Constructor that allows setting a custom radius
     * 
     * @param radius The radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * This Method calculates and returns the area of the circle.
     * 
     * @return The area of the circle.
     */
    public double area() {
        return (22.0 / 7.0) * radius * radius;
    }

    /**
     * Main method for testing the circle class.
     * 
     * @param args Command line arguments(not used).
     */
    public static void main(String[] args) {
        Circle c1 = new Circle(); // Default Constructor is used
        Circle c2 = new Circle(2.8); // Prameterized constructor is used

        System.out.println("Area of circle 1 is: " + c1.area());
        System.out.println("Area of circle 2 is: " + c2.area());

    }
}
