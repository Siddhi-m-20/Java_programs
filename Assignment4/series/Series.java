package series;
import java.util.Scanner;
/* Create a package named Series having three different classes to print series:
a) Prime numbers
b) Fibonacci series
c) Perfect numbers
Write a program to generate ‘n’ terms of the above series*/

public class Series {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        System.out.println("\nPrime Series:");
        PrimeSeries.generateSeries(n);

        System.out.println("Fibonacci Series:");
        FibonacciSeries.generateSeries(n);

        System.out.println("Perfect Series:");
        PerfectSeries.generateSeries(n);
        System.out.println();
    }
}
