package Stats;

import Maths.MathsOperations;

public class StatsOperations {
    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static double median(int a, int b, int c) {
        int max, min;
        max = MathsOperations.maxof3(a, b, c);
        min = MathsOperations.minof3(a, b, c);
        if (a != max && a != min)
            return a;
        else if (b != max && b != min)
            return b;
        else
            return c;
    }
}
