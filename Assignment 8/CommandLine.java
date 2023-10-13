/*Write a Java program to accept command line argument. Display all arguments and the
count of total number of arguments passed. */

public class CommandLine{
    public static void main(String[] args) {
        System.out.println("Arguments passed:");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println("Total number of arguments: " + args.length);
    }
}

/*
javac CommandLine.java       
java CommandLine 64 a -34 $ A
Arguments passed:
64
a
-34
$
A
Total number of arguments: 5 */