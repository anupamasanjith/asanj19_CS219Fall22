package Utility;

import java.util.Scanner;

public class Cone {
    public static double volume(double r, double h) {
        return (Math.PI * h * Math.pow(r, 2))/3;
    }

    public static double getRadius(Scanner s) {
        boolean valid = false;
        double r = 0;
        while (!valid) {
            System.out.print("Enter radius of cone as decimal: ");
            if (s.hasNextDouble()) {
                r = s.nextDouble();
                if (r < 0) {
                    System.out.printf("Error: Radius should be greater than zero.You entered \"%.2f\"\n", r);
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter a decimal number. You entered \"%s\"\n", s.next());
            }
        }
        return r;
    }

    public static double getHeight(Scanner s) {
        boolean valid = false;
        double h = 0;
        while (!valid) {
            System.out.print("Enter height of cone as a decimal: ");
            if (s.hasNextDouble()) {
                h = s.nextDouble();
                if (h < 0) {
                    System.out.printf("Error: Height should be greater than zero.You entered \"%.2f\"\n", h);
                } else {
                    valid = true;
                }

            } else {
                System.out.printf("Error: please enter a decimal number. You entered \"%s\"\n", s.next());
            }

        }
        return h;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double r = getRadius(s);
        double h = getHeight(s);
        System.out.printf("The volume of the cone is %.2f", volume(r, h));
    }
}


