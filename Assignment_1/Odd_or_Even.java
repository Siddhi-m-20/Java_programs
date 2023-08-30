//Write a Java Program to check whether given number is odd or even.

import java.util.Scanner;

public class Odd_or_Even {
    public static void main(String[] args) {
        int x;
        Scanner si = new Scanner(System.in);
        System.out.println("Enter any Number:");
        x = si.nextInt();
        if (x % 2 == 0) {
          System.out.println("Even Number "+x);
        }else{
        System.out.println("Odd Number "+x);

        }
    }
}
