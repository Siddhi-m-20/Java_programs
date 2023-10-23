/*Write a Java Program to write a class Person(pname, address, mobileno, emailid, uid).
 All member variables should be private. Write a default and parameterised constructor.
  Create object using parameterised constructor. (Use final variable, declare uid as final) */

public class Person {
    // Encapsulation
    private final String pname;
    private String address;
    private String mobileno;
    private String emailid;
    private final int uid;

    Person() {
        this.pname = "Megha Kerkar";
        this.address = null;
        this.mobileno = null;
        this.emailid = null;
        this.uid = 9104;
    }

    Person(String pname, String address, String mobileno, String emailid, int uid) {
        this.pname = pname;
        this.address = address;
        this.mobileno = mobileno;
        this.emailid = emailid;
        this.uid = uid;
    }

    // Getter methods

    public String getPname() {
        return pname;
    }

    public String getAddress() {
        return address;
    }

    public String getMobileno() {
        return mobileno;
    }

    public String getEmailid() {
        return emailid;
    }

    public int getUid() {
        return uid;
    }

    // Setter methods

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public static void main(String[] args) {
        Person megha = new Person();
        megha.setAddress("Panjim Goa");
        megha.setMobileno("9876543210");
        megha.setEmailid("megha2347@gmail.com");

        System.out.println("Name : " + megha.getPname());
        System.out.println("Address : " + megha.getAddress());
        System.out.println("Mobile Number : " + megha.getMobileno());
        System.out.println("Email id : " + megha.getEmailid());
        System.out.println("uid : " + megha.getUid());

        Person sandhya = new Person("Sandhya Meshram", "Bhandara Maharashtra", "7676767676",
                "sandhyameshram99@gmail.com", 9105);
        System.out.println("Name : " + sandhya.getPname());
        System.out.println("Address : " + sandhya.getAddress());
        System.out.println("Mobile Number : " + sandhya.getMobileno());
        System.out.println("Email id : " + sandhya.getEmailid());
        System.out.println("uid : " + sandhya.getUid());
    }
}
