/*Write a Java program to find area and perimeter of a circle. */

import java.util.Scanner;

public class Area_peri_circle {
    public static void main(String [] args){
        float A,r,pi,P;
        pi=22f/7f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius: ");
        r=sc.nextFloat();
        A=pi*r*r;
        P=2*pi*r;
        System.out.println("Circumference of Circle is: "+P+" sqcm");
        System.out.println("Area of Circle is: "+A+" sqcm");
    }
}
