package Assignment_1;
//Write a Java program to add two numbers.

import java.util.Scanner;
public class Add2Num {
    
public static void main(String args[])  
{  
int x, y, sum;  
Scanner sc = new Scanner(System.in);  
System.out.println("Enter the first number: ");  
x = sc.nextInt();  
System.out.println("Enter the second number: ");  
y = sc.nextInt();  
sum = x+y;  
System.out.println("The sum of two numbers x and y is: " + sum);  

}
}
