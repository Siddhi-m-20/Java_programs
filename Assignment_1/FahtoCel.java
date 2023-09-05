/*Write a Java program to change temperature from  Fahrenheit to Celsius. */
import java.util.Scanner;

public class FahtoCel {
    public static void main(String args[]) {
        float fah,cel;
        Scanner si = new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit : ");
        fah= si.nextFloat();
        cel=(fah-32f)*(5f/9f); 
        System.out.println("Temperaturen in Celsius: "+cel);
    }
}