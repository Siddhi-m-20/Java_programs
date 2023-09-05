/*Write a Java program to change temperature from Celsius to Fahrenheit. */
import java.util.Scanner;

public class CeltoFah {
    public static void main(String args[]) {
        float fah, cel;
        Scanner si = new Scanner(System.in);
        System.out.println("Enter Temperature in Celsius : ");
        cel = si.nextFloat();
        fah = (cel * 9f / 5f) + 32f;
        System.out.println("Temperature in Fahrenheit: " + fah);
    }
}
