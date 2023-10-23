/**
 * Modify above program. Create ‘n’ objects of ‘Person’ class.
 * Count total number of object created and display it.
 * (Use static variable and static method, don’t use array).
 * Use Javadoc.
 */

/**
 * This class represents a person with various attributes such as name, address, mobile number, email ID, and unique ID.
 * It also provides methods to get and set these attributes.
 * Additionally, it tracks the total number of Person objects created.
 * It can sort objects based on name and mobile number.
 * @author Siddhi Manjarekar
 * @since 21/10/2023
 * @version 20.0.2
 */



public class Person1 {
    /**
     * Encapsulation is achieved by declaring the instance variables of a class as
     * private,
     * which means they can only be accessed within the class.
     * To allow outside access to the instance variables,
     * public methods called getters and setters are defined,
     * which are used to retrieve and modify the values of the instance variables,
     * respectively.
     */

    private final String pname;
    private String address;
    private String mobileno;
    private String emailid;
    private final int uid;
    private static int Totalobj = 0;

    /**
     * Default constructor for person class
     */

    Person1() {
        this.pname = "Megha Kerkar";
        this.address = null;
        this.mobileno = null;
        this.emailid = null;
        this.uid = 9104;
        Totalobj++;
    }

    /**
     * Parametrized constructor for person class
     * 
     * @param pname    of type string, The name of the person
     * @param address  of type string, The address of the person
     * @param mobileno of type string, The mobileno of the person
     * @param emailid  of type string, The email id of the person
     * @param uid      of type integer, The unique identification
     */
    Person1(String pname, String address, String mobileno, String emailid, int uid) {
        this.pname = pname;
        this.address = address;
        this.mobileno = mobileno;
        this.emailid = emailid;
        this.uid = uid;
        Totalobj++;
    }

    /**
     * Gets the total number of objects
     * 
     * @return The count of total objects created.
     */

    public static int getTotalobj() {
        return Totalobj;
    }

    /**
     * Gets the name of the person.
     * 
     * @return The name of the person.
     */
    public String getPname() {
        return pname;
    }

    /**
     * Gets the address of the person.
     * 
     * @return The address of the person.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Gets the mobile number of the person.
     * 
     * @return The mobile number of the person.
     */
    public String getMobileno() {
        return mobileno;
    }

    /**
     * Gets the email id of the person.
     * 
     * @return The email id of the person.
     */
    public String getEmailid() {
        return emailid;
    }

    /**
     * Gets the unique identification of the person.
     * 
     * @return The unique identification of the person.
     */
    public int getUid() {
        return uid;
    }

    /**
     * Sets the address of the person.
     * 
     * @param address The address to set.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Sets the mobile number of the person.
     * 
     * @param mobileno The mobile number to set.
     */
    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    /**
     * Sets the email id of the person.
     * 
     * @param emailid The email id to set.
     */
    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    /**
     * The main method is the entry point for all Java programs.
     * It is required for every Java class, and it is used to start the execution of
     * the program.
     * The main() method must be public, static, and it must return a void.
     * It can have zero or more parameters.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        Person1 megha = new Person1();
        megha.setAddress("Panjim Goa");
        megha.setMobileno("9876543210");
        megha.setEmailid("megha2347@gmail.com");

        System.out.println("Name : " + megha.getPname());
        System.out.println("Address : " + megha.getAddress());
        System.out.println("Mobile Number : " + megha.getMobileno());
        System.out.println("Email id : " + megha.getEmailid());
        System.out.println("uid : " + megha.getUid() + "\n");

        Person1 sandhya = new Person1("Sandhya Meshram", "Bhandara Maharashtra", "7676767676",    "sandhyameshram99@gmail.com", 9105);
        System.out.println("Name : " + sandhya.getPname());
        System.out.println("Address : " + sandhya.getAddress());
        System.out.println("Mobile Number : " + sandhya.getMobileno());
        System.out.println("Email id : " + sandhya.getEmailid());
        System.out.println("uid : " + sandhya.getUid() + "\n");

        System.out.println("Total number of objects created: " + Person1.getTotalobj());
    }
}
