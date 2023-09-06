/*Write a Java program to generate random ‘n’ numbers and find maximum of ‘n’ numbers.
Accept ‘n’ from user. */
import java.util.Scanner;
import java.util.Random;

public class Maxofn{
    public static void main(String [] args){
        int n,i,max;
        Scanner sc=new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        int[] rnum=new int[n];
        for(i=0;i<n;i++){
            rnum[i]=rand.nextInt(100);
        }
        max=rnum[0];
        for(i=1;i<n;i++){
            if(rnum[i]>max){
                max=rnum[i];
            }
        }
        System.out.println("Generated random Numbers:");
        for(i=0;i<n;i++){
            System.out.print(rnum[i]+"    ");
        }
        System.out.println("\nMaximum of n numbers is:"+max);
    }

}




=====OUTPUT=====

  Enter the value of n:
9
Generated random Numbers:
96    75    94    16    18    22    50    99    20
Maximum of n numbers is:99
