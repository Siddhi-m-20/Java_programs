//Write a Java program to find maximum of three numbers.

import java.util.Scanner;

public class Max3Num {
    public static void main(String args[])  
{  
int x, y, z;  
Scanner sc = new Scanner(System.in);  
System.out.println("Enter the three numbers: ");  
x = sc.nextInt();  
y = sc.nextInt();  
z=sc.nextInt();

if(x>y && x>z){
    System.out.println("The Maximum of three is "+x);
}else if(y>z){
    System.out.println("The Maximum of three number is: "+y);
}else{
    System.out.println("The Maximum of three numbers is: "+z);
}
}
}