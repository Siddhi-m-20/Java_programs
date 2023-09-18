/*Write a Java Program to Sort the Array in Descending Order */

import java.util.Scanner;
import java.util.Random;
public class ArrDesc{
    public static void main(String [] args){
        int n,i;
        Random rand=new Random();
        Scanner si=new Scanner(System.in);
        System.out.println("Enter length of the array:");
        n=si.nextInt();
        int arr[]=new int [n];
        for(i=0;i<n;i++){
            arr[i]=rand.nextInt(100);
        }
        System.out.print("The Original Array is:    ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+"   ");
        }
        System.out.println();
        mergeSort(arr,0,n-1);
        System.out.print("The Sorted Array is:    ");
        for(i=n-1;i>=0;i--){
            System.out.print(arr[i]+"   ");
        }
        si.close();
    }

    public static void merge(int arr[],int lb,int mid,int ub){
        int i,j,k;
        i=lb;
        j=mid+1;
        k=lb;
        int b[]=new int [100];
        while(i<=mid && j<=ub){
            if(arr[i]<=arr[j]){
                b[k]=arr[i];
                i++;
                k++;
            }else{
                b[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            b[k]=arr[i];
            i++;
            k++;
        }
        while(j<=ub){
            b[k]=arr[j];
            j++;
            k++;
        }
        for(k=lb;k<=ub;k++){
            arr[k]=b[k];
        }

    }

    public static void mergeSort(int arr[],int lb,int ub){
        int mid;
        if(lb<ub){
            mid=(lb+ub)/2;
            mergeSort(arr, lb, mid);
            mergeSort(arr, mid + 1, ub);
            merge(arr, lb, mid, ub);
        }
    }

}





=====OUTPUT======

Enter length of the array:
10
The Original Array is:    50   17   40   16   74   28   59   35   31   61
The Sorted Array is:    74   61   59   50   40   35   31   28   17   16

  
