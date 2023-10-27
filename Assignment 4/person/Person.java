/*Write a Java program to create Person as a class with 
name and age as private attributes and accept and display methods.
Derive two subclasses as Student and Teacher from Person. 
The Student class have a private attribute as marks and 
the Teacher class have a private attribute as salary. 
Write getter and setter methods. 
Write a method to accept and display details of student and teacher. 
Write a menu driven program. (Hint: user super). */

package person;
import java.util.Scanner;
public class Person {
    private String name;
    private int age;

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Age: ");
        age = sc.nextInt();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}





