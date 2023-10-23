package person;
import java.util.Scanner;

public class Student extends Person {
    private int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void accept() {
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks: ");
        marks = sc.nextInt();
 
    }

    public void display() {
        super.display();
        System.out.println("Marks: " + marks);
    }
}