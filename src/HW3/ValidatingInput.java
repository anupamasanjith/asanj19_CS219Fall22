package HW3;

import Utility.Investment;

import java.util.Scanner;

public class ValidatingInput {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter initial deposit as decimal: ");
        double c = 0;
        if (s.hasNextDouble()) {
            c = s.nextDouble();
        } if (c < 0) {
            System.out.printf("Error: initial deposit should be greater than zero.You entered %s", c);
        } else {
            System.out.printf("Error: Decimal expected. You entered %s", c);
            return;

        }


    }
}
