package Interface;

/*Define an interface “Operation” which has methods area(), volume().
Define a constant PI having a value 3.142.Create a class cylinder 
which implements this interface (members – radius, height) 
Create one object and calculate the area and volume */

public class Cylinder implements Operation {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        return 2 * PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return PI * radius * radius * height;
    }
}
