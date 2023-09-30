import java.util.Scanner;
import java.util.Random;

public class MatrixOp {
    public static void main(String[] args) {
        int m, n, o, p;
        String choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns for the matrix 1:");
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix1 = new int[m][n];
        accept(matrix1, m, n);
        display(matrix1, m, n);
        System.out.println("Enter number of rows and columns for the matrix 2:");
        o = sc.nextInt();
        p = sc.nextInt();
        int[][] matrix2 = new int[o][p];
        int[][] resultMatrix = new int[m][p];
        accept(matrix2, o, p);
        display(matrix2, o, p);

        do {
            System.out.println("operations on matrix \n a) Matrix Addition \n b) Matrix Multiplication\n c) Transpose of a matrix");
            choice = sc.next();
            switch (choice) {
                case "a":
                    if (m == o && n == p) {
                        System.out.println("Matrix Addition:");
                        sumOfMatrices(matrix1, matrix2, m, n);
                    } else {
                        System.out.println("Addition is not possible as number of rows and columns are not equal.\n");
                    }
                    break;
                case "b":
                    if (n == o) {
                        System.out.println("Matrix Multiplication:");
                        productOfMatrices(matrix1, matrix2, m, n, p);
                    } else {
                        System.out.println("Matrix Multiplication is not Possible.");
                    }
                    break;
                case "c":
                    System.out.println("Transpose of A Matrix is:\n");
                    transposeOfMatrix(matrix1, resultMatrix, m, n);
                    break;
            }

        } while(!choice.equals("d"));
        sc.close();
    }

    public static void accept(int[][] arr, int m, int n) {
        Random rand = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = rand.nextInt(100);
            }
        }
    }

    public static void display(int[][] arr, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sumOfMatrices(int[][] matrix1, int[][] matrix2, int m, int n) {
        int[][] sum = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        display(sum, m, n);
    }

    public static void productOfMatrices(int[][] matrix1, int[][] matrix2, int m, int n, int p) {
        int[][] product = new int[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                product[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        display(product, m, p);
    }

    public static void transposeOfMatrix(int[][] matrix1, int[][] resultMatrix, int m, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                resultMatrix[i][j] = matrix1[j][i];
            }
        }
        display(resultMatrix, n, m);
    }
}
/*
 * Enter number of rows and columns for the matrix 1:
2
2
3 79 
41 79 
Enter number of rows and columns for the matrix 2:
2
2
98 11
65 78
operations on matrix
 a) Matrix Addition
 b) Matrix Multiplication
 c) Transpose of a matrix
a
Matrix Addition:
101 90
106 157
operations on matrix
 a) Matrix Addition
 b) Matrix Multiplication
 c) Transpose of a matrix
b
Matrix Multiplication:
5429 6195
9153 6613
operations on matrix
 a) Matrix Addition
 b) Matrix Multiplication
 c) Transpose of a matrix
c
Transpose of A Matrix is:

3 41
79 79
operations on matrix
 a) Matrix Addition
 b) Matrix Multiplication
 c) Transpose of a matrix
d
 */