/*Define a class MyNumber having one private int data member.
 Write a default constructor to initialize it to 0 and 
 another constructor to initialize it to a value (Use this).
  Write methods isNegative, isPositive, isZero, isOdd, isEven. 
  Create an object in main. Use command line arguments to pass a value to the object 
  (Hint : convert string argument to integer) and perform the above tests. */

public class MyNumber {
    private int data; //Private data member
    MyNumber(){
        this.data=0;
    }
    MyNumber(int data){
        this.data=data;
    }
    public boolean isNegative(){
        return data<0;
    }
    public boolean isPositive(){
        return data>0;
    }
    public boolean isEven(){
        return data%2==0;
    }
    public boolean isOdd(){
        return data%2!=0;
    }
    public boolean isZero(){
        return data==0;
    }
    public static void main(String[] args){
        int data=Integer.parseInt(args[0]);
        MyNumber mynum=new MyNumber(data);
        System.out.println("Number = "+mynum.data);
        System.out.println("Is given Number a Negative Number: "+mynum.isNegative());
        System.out.println("Is given Number a Positive Number: "+mynum.isPositive());
        System.out.println("Is given Number a Even Number: "+mynum.isEven());
        System.out.println("Is given Number a Odd Number: "+mynum.isOdd());
        System.out.println("Is given Number a Zero: "+mynum.isZero());
    }

}
