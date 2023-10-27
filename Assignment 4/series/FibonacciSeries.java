package series;

public class FibonacciSeries {
    public static void generateSeries(int n) {
        long first = 0, second = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            long temp = first + second;
            first = second;
            second = temp;
        }
        System.out.println();
    }
}
