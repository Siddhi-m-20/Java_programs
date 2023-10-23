import java.util.Arrays;
import java.util.Comparator;

/**
 * This class represents a person with various attributes such as name, address,
 * mobile number, email ID, and unique ID.
 * It also provides methods to get and set these attributes.
 * Additionally, it tracks the total number of Person objects created.
 * It can sort objects based on name and mobile number.
 * 
 * @author Siddhi Manjarekar
 * @since 21/10/2023
 * @version 20.0.2
 */

public class Person2 {
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

    /**
     * Default constructor for person class
     */

    Person2() {
        this.pname = "Megha Kerkar";
        this.address = "Panjim Goa";
        this.mobileno = "9876543210";
        this.emailid = "megha2347@gmail.com";
        this.uid = 9104;
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

    Person2(String pname, String address, String mobileno, String emailid, int uid) {
        this.pname = pname;
        this.address = address;
        this.mobileno = mobileno;
        this.emailid = emailid;
        this.uid = uid;
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
     * Sorts the array of Person objects by pname.
     * 
     * @param persons Array of Person objects to be sorted.
     */
    public static void sortByPName(Person2[] persons) {
        Arrays.sort(persons, Comparator.comparing(Person2::getPname));
    }

    /**
     * Sorts the array of Person objects by mobileno.
     * 
     * @param persons Array of Person objects to be sorted.
     */
    public static void sortByMobileNo(Person2[] persons) {
        Arrays.sort(persons, Comparator.comparing(Person2::getMobileno));
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
        // Creating an array of Person objects
        Person2[] people = new Person2[6];

        // Populating the array
        people[0] = new Person2("Ajay Raut", "New Delhi", "1234567890", "ajayraut@example.com", 1001);
        people[1] = new Person2("Racheal Green", "New York", "2376543210", "greenrachel@example.com", 1002);
        people[2] = new Person2("Danial Gellar", "UK", "5555555555", "danialgellar@example.com", 1003);
        people[3] = new Person2();
        people[4] = new Person2("Kartik Ghonge", "maharashtra", "4512390890", "kartikg11@example.com", 4567);
        people[5] = new Person2("Sagar Panchal", "Bhandara", "6767543210", "sagarpanchal@example.com", 5656);
        // Sorting by pname
        sortByPName(people);

        System.out.println("Sorted by pname:");
        for (Person2 person : people) {
            System.out.println(person.getPname()+"      "+person.getAddress()+"     "+person.getMobileno()+"        "+person.getEmailid()+"     "+person.getUid());
        }

        // Sorting by mobileno
        sortByMobileNo(people);

        System.out.println("\nSorted by mobileno:");
        for (Person2 person : people) {
            System.out.println(person.getPname()+"      "+person.getAddress()+"     "+person.getMobileno()+"        "+person.getEmailid()+"     "+person.getUid());
        }

    }
}
