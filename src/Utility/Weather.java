package Utility;

import java.util.Scanner;

public class Weather {
    public static double windchill(double t, // Temperature
                                 double v) { // Velocity in MPH
        return 35.74 + 0.6215*t + ((0.4275*t)-(35.75)) * Math.pow(v, 0.16);

    }

    public static void main (String [] args) {

        Scanner kbd = new Scanner(System.in); // kbd stands for keyboard, Scanner used for reading input.
        System.out.print("Enter temperature in degrees F:");
        double temperature = kbd.nextDouble();
        System.out.print("Enter wind velocity in degrees MPH:");
        double velocity = kbd.nextDouble();

        System.out.printf("Windchill for %.1f degrees f and %.1f Mph is %.2f\n",
                temperature, velocity,windchill(temperature,velocity));

        System.out.println("They said \"Dont do it\"");
        System.out.println("They said \"Dont\ndo\nit\"");

    }
}
