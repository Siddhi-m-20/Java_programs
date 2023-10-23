package employee;
// Clerk class extends Employee
public class Clerk extends Employee {
    private double overtime;
    private double netSalary;
    // Constructor
    public Clerk(int eno, String ename, double salary, double overtime) {
        super(eno, ename, salary);
        this.overtime = overtime;
    }
    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    // Override calculateNetSalary method
    @Override
    public double calculateNetSalary() {
        netSalary = super.getSalary() + (overtime * 100); // Assuming overtime rate is 100 per hour
        return netSalary;
    }

    // Override displayInfo method
    @Override
    public void displayInfo() {
         System.out.println("Designation: Clerk");
        super.displayInfo();
    }
}
