/*
 * Write a program in Java with class Rectangle with the data fields width, length, area and color. 
 * Member variables should be declared as private. 
 * The length, width and area are of double type and color is of string type. 
 * Write getter and setter methods for all member variables. 
 * Create two object of Rectangle and compare their area and color. 
 * If area and color both are same for the objects then display “Matching Rectangles”
 * otherwise display “Non matching Rectangle”.
 */

public class Rectangle {
    private double width, length, area;
    private String color;

    public Rectangle(double width, double length, String color) {
        this.width = width;
        this.length = length;
        this.area = width * length;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        this.area = width * this.length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
        this.area = length * this.width;
    }

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public boolean equals(Rectangle rect) {
        return rect.area == this.area && rect.color.equals(this.color);
    }
    

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10, "Blue");
        Rectangle r2 = new Rectangle(2, 5, "Black");
        if (r1.equals(r2)) {
            System.out.println("Matching Rectangles");
        } else {
            System.out.println("Non matching Rectangles");
        }
    }
}