/*Write a Java program to find range of ‘n’ numbers(Hint: Use an array and accept values
from user) */
import java.util.Scanner;
public class Rangeofn {
    public static void main(String [] args){
        int i,n,max,min,Range;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of the arrray:");    
        n=sc.nextInt();
        int [] arr =new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        max=arr[0];
        for(i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        min=arr[0];
        for(i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        Range=max-min;
        System.out.println("Range of the array is "+Range);
    }
}
