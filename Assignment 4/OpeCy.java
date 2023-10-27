import Interface.*;
import java.util.Scanner;
public class OpeCy {
    public static void main(String[] args) {
        Scanner si=new Scanner(System.in);
        double r,h;
        System.out.println("Enter Radius and Height of Cylinder.");
        r=si.nextDouble();
        h=si.nextDouble();
        Cylinder cylinder = new Cylinder(r, h);
        double area = cylinder.area();
        double volume = cylinder.volume();

        System.out.println("Area of the cylinder: " + area);
        System.out.println("Volume of the cylinder: " + volume);
    }
}
