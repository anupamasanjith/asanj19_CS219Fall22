package HW1;

public class Time {
    public static void main(String [] args) {
        // Declaring all variables and types.
     int hour = 9;
     int minute = 36;
     int second = 45;
     // Formula for part 2 and 3
     int number_of_seconds_since_midnight = (hour * 3600) + (minute * 60) + second;
     int number_of_minutes_to_midnight = (24*3600) - number_of_seconds_since_midnight;

     // Print the seconds since Midnight
     System.out.println("Homework 1");
     System.out.print(hour);
     System.out.print(":");
     System.out.print(minute);
     System.out.print(":");
     System.out.print(second);
     System.out.print(" is ");
     System.out.print(number_of_seconds_since_midnight);
     System.out.println(" seconds since midnight.");

     // Print the seconds to midnight
     System.out.print("There are ");
     System.out.print(number_of_minutes_to_midnight);
     System.out.println(" seconds remaining till midnight.");

     // computing percentage elapsed
     int percentage_since_midnight = Math.round(number_of_seconds_since_midnight * 100) / (24*3600);

     // Print out percentage elapsed
     System.out.print(percentage_since_midnight);
     System.out.print("% ");
     System.out.println("of the day has elapsed.");

     // Reassigning variables time of completion
     hour = 22;
     minute = 55;
     second = 52;

     // Formula for converting time into seconds and then computing time elapsed
     int number_of_seconds_since_midnight_completion = (hour * 3600) + (minute * 60) + second;
     int elapsed_time_since_completion = (number_of_seconds_since_midnight_completion) - (number_of_seconds_since_midnight);

     // converting elapsed seconds to hours and then rounding to the nearest whole number
     int elapsed_time_in_hours = Math.round(elapsed_time_since_completion)/3600;

     // Print out time elapsed
     System.out.print("The time elapsed since working on this code is ");
     System.out.print(elapsed_time_in_hours);
     System.out.println(" hours");

    }

}
