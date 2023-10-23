package shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        Triangle triangle = new Triangle(base, height);
        System.out.println("\nTriangle Area: " + triangle.getArea());
        if (triangle.getCircumference() == -1.0) {
            System.out.println("We do not calculate Circumference for triangle.\n");
        }

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("\nRectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Circumference: " + rectangle.getCircumference());

        System.out.print("\nEnter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println("\nCircle Area: " + circle.getArea());
        System.out.println("Circle Circumference: " + circle.getCircumference()+"\n");

        scanner.close();
    }
}
