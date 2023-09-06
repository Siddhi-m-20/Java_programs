/*Write a Java program to accept ‘n’ numbers and store the odd numbers and even numbers
in separate arrays. */

import java.util.Random;
import java.util.Scanner;

public class SepOddEven {
    public static void main(String[] args) {
        int n, i,e=0,o=0;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter the value of n:");
        n = sc.nextInt();

        int[] arr = new int[n];
        
        for (i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100);
        }
        for (i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                e++;
            } else {
                o++;
            }
        }
        int[] even = new int[e];
        int[] odd = new int[o];

        e=0;
        o=0;
        for (i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even[e] = arr[i];
                e++;
            } else {
                odd[o] = arr[i];
                o++;
            }
        }
        System.out.println("ARRAY:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + "    ");
        }
        System.out.println("\nEVEN:");
        for (i = 0; i < e; i++) {
            System.out.print(even[i] + "    ");
        }
        System.out.println("\nODD:");
        for (i = 0; i < o; i++) {
            System.out.print(odd[i] + "    ");
        }
    }
}
