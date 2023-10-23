/*Write a java program to create a Shape Abstract Class and 3 subclasses, 
Triangle, Rectangle, and Circle. Shape also defines 2 abstract methods
 calculateArea() and calculateCircumference().
  Both return doubles representing the area and circumference of the shapes respectively.
 For each shape you will have to create the necessary values need to calculate each of these values and getters and setters for each of the values. You will also need to create constructors for each class, and the instructions for those will be included with each class. */
package shape;

public abstract class Shape {
    protected double area;
    protected double circumference;

    public abstract double calculateArea();
    public abstract double calculateCircumference();

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }
}

