/*Write a Java program to check whether a year is leap year or not. (Accept a value from
user) */

import java.util.Scanner;


public class Leapcheck {
    public static void main(String[] args){
    int year;
    Scanner si=new Scanner(System.in);
    System.out.println("Enter year:");
    year=si.nextInt();
    if((year%400==0) ||((year%100!=0) && (year%4==0))){
        System.out.println(year+" is a Leap year.");
    }
    else{
        System.out.println(year+ " is not a leap year.");
    }
}
}
