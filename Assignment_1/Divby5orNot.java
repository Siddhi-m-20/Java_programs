
/*Write a Java program to check whether a number is divisible by 5 or not. */
import java.util.Scanner;

public class Divby5orNot {
    public static void main(String[] args) {
        int x;
        Scanner si = new Scanner(System.in);
        System.out.println("Enter any Number:");
        x = si.nextInt();
        if (x % 5 == 0) {
            System.out.println(x + " is divisible by 5.");
        } else {
            System.out.println(x + "is not divisible by 5.");
        }
    }
}
