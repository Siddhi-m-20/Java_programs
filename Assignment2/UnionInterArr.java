
/*Write a Java Program to Find Union & Intersection of 2 Arrays. Generate array elements
randomly */
import java.util.Scanner;
import java.util.Random;

public class UnionInterArr {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array 1:");
        n1 = sc.nextInt();
        int arr1[] = new int[n1];
        accept(arr1, n1);
        System.out.println("Enter length of the array 2:");
        n2 = sc.nextInt();
        int arr2[] = new int[n2];
        accept(arr2, n2);
        System.out.print("Array 1: ");
        display(arr1, n1);
        System.out.print("Array 2: ");
        display(arr2, n2);

        System.out.println("Union of Array 1 and Array 2 is:");
        Union(arr1, arr2, n1, n2, n1 + n2);

        System.out.println("Intersection of the Array 1 and Array 2 is:");
        Intersection(arr1, arr2, n1, n2);

        sc.close();
    }

    public static void accept(int[] arr, int n) {
        int i;
        Random rand = new Random();
        for (i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100);
        }
    }

    public static void display(int[] arr, int n) {
        int i;
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Union(int[] arr1, int[] arr2, int n1, int n2, int n) {
        int arr3[] = new int[n];
        int i, j;

        for (i = 0; i < n1; i++) {
            arr3[i] = arr1[i];
        }

        for (j = 0; j < n2; j++) {
            arr3[i + j] = arr2[j];
        }

        display(arr3, n);
    }


    public static void Intersection(int [] arr1,int [] arr2, int n1,int n2){
        int i,j,k=0,r;
        int arr3[]=new int[n1<n2?n1:n2];
        for( i=0; i<n1; i++)
        {
            for(j=0; j<n2; j++)
            {
                if(arr1[i]==arr2[j])
                {
    
                    arr3[k]=arr1[i];
                    k++;
                }
            }
        }
        for(r=0; r<k; r++)
            System.out.print(arr3[r]+" ");
    }


    
}