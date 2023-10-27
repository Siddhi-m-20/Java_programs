/*Create ‘n’ objects of above class ‘product’ using an array. 
Sort the objects on product_cost.(Hint: Use static method). */

import java.util.Scanner;

public class Product1 {
    static int Totalobj = 0;
    int product_id;
    String product_name;
    double product_cost;
    int product_quantity;

    public Product1() {
        Totalobj++;
    }

    public Product1(int id, String name, double cost, int quantity) {
        this.product_id = id;
        this.product_name = name;
        this.product_cost = cost;
        this.product_quantity = quantity;
        Totalobj++;
    }
    public void displayProduct() {
        System.out.println("Product ID: " + product_id+"\t");
        System.out.println("Product Name: " + product_name+"\t");
        System.out.println("Product Cost: " + product_cost+"\t");
        System.out.println("Product Quantity: " + product_quantity);
        System.out.println();
    }
    public static void BubbleSortByCost(Product1[] product,int n){
        Product1 temp;
        int i,j;
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(product[j].product_cost > product[j+1].product_cost){
                    temp=product[j];
                    product[j]=product[j+1];
                    product[j+1]=temp;
                }
            }
        } 
    }

    public static void main(String []args){
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many products:");
        n=sc.nextInt();
        Product1[] product=new Product1[n];
        System.out.println("Enter data of Product:");
        System.out.println("Product id\tProduct Name\tProduct Cost\t Product Quantity");
        for(i=0;i<n;i++){
            product[i]=new Product1(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt());
        }
                 sc.close();
        System.out.println("\nProduct data before Sorting:\n");
        for(Product1 p:product){
            p.displayProduct();
        }
        BubbleSortByCost(product, n);
        System.out.println("Product data After Sorting:\n");
        for(Product1 p:product){
            p.displayProduct();
        }
       
    }
}
