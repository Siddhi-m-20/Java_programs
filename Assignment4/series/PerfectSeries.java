package series;

public class PerfectSeries {
    public static void generateSeries(int n) {
        int count = 0;
        long num = 2;
        while (count < n) {
            int sum = 1;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    sum += i;
                    if (i != num / i) {
                        sum += num / i;
                    }
                }
            }
            if (sum == num) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }
}
