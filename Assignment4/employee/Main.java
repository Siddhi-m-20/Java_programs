package employee;

public  class Main {
    public static void main(String[] args) {
        // Creating Manager object
        Manager manager = new Manager(32015, "Sameer Ghonge", 150000, 1000);
        System.out.println("Manager's Information:");
        manager.displayInfo();

        System.out.println("\n");

        // Creating Clerk object
        Clerk clerk = new Clerk(32234, "Prasad Temkar", 40000, 10);
        System.out.println("Clerk's Information:");
        clerk.displayInfo();
    }
}
