//Write a Java program to compute the circle of area.

import java.util.Scanner;

public class CircleArea {
    public static void main(String [] args){
        float A,r,pi;
        pi=22/7f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius: ");
        r=sc.nextFloat();
        A=pi*r*r;
        System.out.println("Area of Circle is: "+A);
    }
}
