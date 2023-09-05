/*Write a Java program to swap two numbers. */

import java.util.Scanner;

public class Swap2num {
    public static void main(String args[]) {
        int x, y,t;
        Scanner si = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        x = si.nextInt();
        System.out.println("Enter the second number: ");
        y = si.nextInt();
        System.out.println("Before swapping: " +x+"\t"+y);
        t=x;
        x=y;
        y=t;
        System.out.println("After swapping: " +x+"\t"+y);
    }
}
