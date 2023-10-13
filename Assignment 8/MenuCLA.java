/*Write a menu driven Java program. Accept a Number using command line argument to
perform following operations
a) Find the factorial of given Number.
b) Check the Number is Armstrong or not.*/
import java.math.BigInteger;
import java.util.Scanner;
public class MenuCLA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println(
                "a) Find the factorial of given Number.\nb) Check the Number is Armstrong or not.\n");
        do {
            int n = Integer.parseInt(args[0]);
             s = sc.next();
            switch (s) {
                case "a":
                    BigInteger fact = factorial(n);
                    System.out.println("Factorial of the given Number is:" + fact);
                    break;
                case "b":
                    int num, rem, result = 0, digits = 0;
                    num = n;
                    int temp = num;
                    while (temp != 0) {
                        digits++;
                        temp /= 10;
                    }
                    temp = num;
                    while (temp != 0) {
                        rem = temp % 10;
                        result += Math.pow(rem, digits);
                        temp /= 10;
                    }
                    if (result == num)
                        System.out.println(num + " is an Armstrong Number.");
                    else
                        System.out.println(num + " is not an Armstrong Number.");
                    break;
                
            }
        } while (!s.equals("c"));
        sc.close();
    }

    public static BigInteger factorial(int num) {
        if (num == 0) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(num).multiply(factorial(num - 1));
        }
    }
}
