package HW2;
//importing scanner class
import java.util.Scanner;

public class DayOfWeek {
    public static int dayofweek(int m, int d, int y) {
        int y0 = y - (14 - m)/12; // Declaring variables for final formula
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12*((14 - m) / 12) - 2;
        return (d + x + (31*m0)/ 12) % 7 ;

    }
    public static void main (String [] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter month: "); // prompting user to input value for month
        int m = kbd.nextInt(); //scanning input as int
        System.out.print("Enter day: "); // prompting user to input value for day
        int d = kbd.nextInt();
        System.out.print("Enter year in 4 digits: "); // prompting user to input value for year
        int y = kbd.nextInt();

        System.out.println(dayofweek(m,d,y)); // printing final integer

    }
}
