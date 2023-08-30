//Write a Java program to print all the odd number 1 to 50


public class Odd1to50 {
    public static void main(String [] args){
        int i;
        System.out.println("Odd Numbers from one to fifty: ");
        for(i=1;i<=50;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    
}
