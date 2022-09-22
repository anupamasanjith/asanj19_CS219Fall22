package HW4;

import Utility.Investment;

import java.util.Scanner;

public class Investment3 {
    public static double GetInitialDeposit(Scanner s) {
        boolean valid = false;
        double c = 0;
        while (!valid) {
            System.out.print("Please enter initial deposit as decimal: ");
            if (s.hasNextDouble()) {
                c = s.nextDouble();
                if (c < 0) {
                    System.out.printf("Error: initial deposit should be greater than zero.You entered \"%.2f\"\n", c);
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter a decimal number. You entered \"%s\"\n", s.next());
            }
        }
        return c;
    }

    public static double GetInterestRate(Scanner s) {
        boolean valid = false;
        double r = 0;
        while (!valid) {
            System.out.print("Please enter interest rate as a decimal: ");
            if (s.hasNextDouble()) {
                r = s.nextDouble();
                if ((r < 0) || (r >= 1)) {
                    System.out.printf("Error: interest rate should be expressed as a decimal between 0 and 1." +
                            " You entered \"%.2f\"\n", r);
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter a decimal number. You entered \"%s\"\n", s.next());
            }

        }
        return r;
    }

    public static int GetYears(Scanner s) {
        boolean valid = false;
        int t = 0;
        while (!valid) {
            System.out.print("Please enter number of years as an integer: ");
            if (s.hasNextInt()) {
                t = s.nextInt();
                if (t < 0) {
                    System.out.printf("Error: interest rate should be greater than 0. You entered \"%d\"\n", t);
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter an integer. You entered \"%s\"\n", s.next());
            }

        }
        return t;
    }
    public static int GetCompoundYears(Scanner s){
        boolean valid = false;
        int n = 0;
        while (!valid) {
            System.out.print("Please enter number of times to compound per year as an integer: ");
            if (s.hasNextInt()) {
                n = s.nextInt();
                if (n < 0) {
                    System.out.printf("Error: number of years to compound should be greater " +
                            "than 0. You entered \"%d\"\n", n);
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter an integer. You entered \"%s\"\n", s.next());
            }
        }
        return n;
    }
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        double c = GetInitialDeposit(s);
        double r = GetInterestRate(s);
        int t = GetYears(s);
        int n = GetCompoundYears(s);
        System.out.printf("Your investment is worth %.2f",
                Investment.investment(c,r,t,n));

    }
}

