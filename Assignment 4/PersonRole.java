import person.*;
import java.util.Scanner;

public class PersonRole extends Student{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n**********Menu**********\n");
            System.out.println(
                    "1.Enter Student Details and Display Student Details\n2.Enter Teacher Details and Display Teacher Details\n3.Exit.\n");
            System.out.println("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Student s1 = new Student();
                    s1.accept();
                    System.out.println("\nStudent Details: \n");
                    s1.display();
                    break;
                case 2:
                    Teacher t1 = new Teacher();
                    t1.accept();
                    System.out.println("\nTeacher Details\n");
                    t1.display();
                    break;
                case 3:
                    System.out.println("Exiting........");
                    break;
                default:
                    System.out.println("Invalid choice,Please try agaain...");
            }
        } while (choice != 3);
    }
}
