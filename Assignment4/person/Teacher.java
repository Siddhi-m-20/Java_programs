package person;
import java.util.Scanner;

public class Teacher extends Person {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void accept() {
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary: ");
        salary = sc.nextDouble();
     
    }

    public void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }

}