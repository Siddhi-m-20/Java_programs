/*Create an abstract class employee, having its private data members (eno, ename, salary)
 & abstract function for calculating net salary and displaying the information. 
 Derive manager & clerk class from this abstract class & 
 implement the abstract method net salary and override the display method. */

package employee;
// Abstract Employee class
public abstract class Employee {
    private int eno;
    private String ename;
    private double salary;

    public Employee(int eno, String ename, double salary) {
        this.eno = eno;
        this.ename = ename;
        this.salary = salary;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double calculateNetSalary();

    public void displayInfo() {
        System.out.println("Employee Number: " + eno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Salary: " + salary);
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}
