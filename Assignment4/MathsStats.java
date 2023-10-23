/*Create a package named Maths. Define class MathsOperations with static methods 
to find the maximum and minimum of three numbers. Create another package Stats.
 Define class StatsOperations with methods to find the average and median of three numbers.
 Use these methods in main to perform operations on three integers accepted using command line arguments. */
import Maths.MathsOperations;
import Stats.StatsOperations;

public class MathsStats {
    public static void main(String []args){
        if (args.length != 3) {
            System.out.println("Please provide three integers as arguments.");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int max = MathsOperations.maxof3(a, b, c);
        int min = MathsOperations.minof3(a, b, c);

        double average = StatsOperations.average(a, b, c);
        double median = StatsOperations.median(a, b, c);

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Average: " + average);
        System.out.println("Median: " + median);
    }
}
