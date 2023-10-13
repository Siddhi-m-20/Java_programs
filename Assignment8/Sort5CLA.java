/*Write a java program to accept 5 numbers using command line arguments sort and
display them */


public class Sort5CLA {
    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Please provide exactly 5 numbers as command-line arguments.");
            return;
        }

        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }


        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("Sorted numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
