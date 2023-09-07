/*Write a Java Program to
 find the sum and product of all elements 
 of an array.*/

import java.util.Scanner;
import java.util.Random;

class SumProArr {
    public static void main(String args[]) {
        int n, i;
        long sum = 0, product = 1;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter the value of n:");
        n = sc.nextInt();
        int[] rnum = new int[n];
        for (i = 0; i < n; i++) {
            rnum[i] = rand.nextInt(100);
        }
        for (i = 0; i < n; i++) {
            sum = sum + rnum[i];
        }
        for (i = 0; i < n; i++) {
            product = product * rnum[i];
        }
        System.out.println("Generated random Numbers:");
        for (i = 0; i < n; i++) {
            System.out.print(rnum[i] + "    ");
        }
        System.out.println("\n");
        System.out.println("Sum of the array: " + sum);
        System.out.println("Product of the Array: " + product);
        sc.close();
    }

}