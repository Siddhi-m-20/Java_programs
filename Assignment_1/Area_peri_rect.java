/*Write a Java program to find area and perimeter of a rectangle */

import java.util.Scanner;

public class Area_peri_rect {
    public static void main(String [] args){
        float l,b,P,A;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length and breadth of the rectangle: ");
        l=sc.nextFloat();
        b=sc.nextFloat();
        P=2*(l+b);
        A=l*b;
        System.out.println("Perimeter of Rectangle is: "+P+"sqcm");
        System.out.println("Area of Rectangle is: "+A+"sqcm");
    }
}