//Write a Java program to print the squares and cubes for the numbers 1 to 10.

public class SqrCub1to10 {
    public static void main(String[] args){
        int i,sqr,cub;
        System.out.println("Numbers from 1 to 10:");
        System.out.println("Number\tSquare\tCube");
        
        for (i = 1; i <= 10; i++) {
            sqr= i * i;
            cub = i * i * i;
            System.out.println(i + "\t" + sqr + "\t" + cub);
        }

    }
}





===OUTPUT===
Numbers from 1 to 10:
Number  Square  Cube
1       1       1
2       4       8
3       9       27
4       16      64
5       25      125
6       36      216
7       49      343
8       64      512
9       81      729
10      100     1000
