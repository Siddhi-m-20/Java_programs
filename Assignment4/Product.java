/*Write a program to create a class product(product_id, product_name, product_cost, product_quantity)
 define a default and parameterized constructor. Create objects of class product and
  display the contents of each object and also display the object count. */

public class Product {
    static int Totalobj = 0;
    int product_id;
    String product_name;
    double product_cost;
    int product_quantity;

    public Product() {
        Totalobj++;
    }

    public Product(int id, String name, double cost, int quantity) {
        this.product_id = id;
        this.product_name = name;
        this.product_cost = cost;
        this.product_quantity = quantity;
        Totalobj++;
    }

    public void displayProduct() {
        System.out.println("Product ID: " + product_id);
        System.out.println("Product Name: " + product_name);
        System.out.println("Product Cost: " + product_cost);
        System.out.println("Product Quantity: " + product_quantity);
        System.out.println();
    }

    public static void main(String[] args) {
        Product p1 = new Product(1, "Mobile", 21000.00, 100);
        Product p2 = new Product(2, "Earphone", 1500.00, 500);
        Product p3 = new Product();
        System.out.println("Product 1:");
        p1.displayProduct();
        System.out.println("Product 2:");
        p2.displayProduct();
        System.out.println("Product 3");
        p3.displayProduct();

        System.out.println("Total Objects Created: " + Totalobj);
    }
}
