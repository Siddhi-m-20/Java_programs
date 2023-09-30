/*1) Write a java program to display the system date and time in various formats shown
below:
• Current date is : 31/07/2015
• Current date is : 07-31-2015
• Current date is : Friday July 31 2015
• Current date and time is : Fri July 31 16:25:56 IST 2015
• Current date and time is : 31/07/15 16:25:56 PM +0530
• Current time is : 16:25:56
• Current week of year is : 31
• Current week of month : 5
• Current day of the year is : 212
Note: Use java.util.Date and java.text.SimpleDateFormat class */

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateTime {

    public static void main(String[] args) {
        Date currentDate = new Date();

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yyyy");
        SimpleDateFormat sdf3 = new SimpleDateFormat("EEEE MMMM dd yyyy");
        SimpleDateFormat sdf4 = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");
        SimpleDateFormat sdf5 = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");
        SimpleDateFormat sdf6 = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat sdf7 = new SimpleDateFormat("w");
        SimpleDateFormat sdf8 = new SimpleDateFormat("W");
        SimpleDateFormat sdf9 = new SimpleDateFormat("D");

        System.out.println("Current date is : " + sdf1.format(currentDate));
        System.out.println("Current date is : " + sdf2.format(currentDate));
        System.out.println("Current date is : " + sdf3.format(currentDate));
        System.out.println("Current date and time is : " + sdf4.format(currentDate));
        System.out.println("Current date and time is : " + sdf5.format(currentDate));
        System.out.println("Current time is : " + sdf6.format(currentDate));
        System.out.println("Current week of year is : " + sdf7.format(currentDate));
        System.out.println("Current week of month is : " + sdf8.format(currentDate));
        System.out.println("Current day of the year is : " + sdf9.format(currentDate));
    }
}
