package employee;

class Manager extends Employee {
    private double allowances;
    private double netSalary;
    public Manager(int eno, String ename, double salary, double allowances) {
        super(eno, ename, salary);
        this.allowances = allowances;
    }
    public double getAllowances() {
        return allowances;
    }

    public void setAllowances(double allowances) {
        this.allowances = allowances;
    }
    @Override
    public double calculateNetSalary() {
        netSalary = super.getSalary() + allowances;
        return netSalary;
    }

    @Override
    public void displayInfo() {
        System.out.println("Designation: Manager");
        super.displayInfo();
    }
}
