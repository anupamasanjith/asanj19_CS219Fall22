package Exam1;

import java.util.Scanner;

public class Exam1 {
    public static int getNumber(Scanner s){
        boolean valid = false;
        int i = 0;
        while (!valid){
            System.out.print("Enter a number: ");
            if (s.hasNextInt()){
                i = s.nextInt();
                if (i<0){
                    System.out.printf("Error: Please enter a positive integer. You entered \"%d\"\n",i);
                } else {
                    valid = true;
                }

            } else {
                System.out.printf("Error: Please enter an integer. You entered \"%s\"\n",s.next());
            }

        }
        return i;
    }
    public static int count2and7(int n) {
        int Count = 0;
        while (n != 0) {
            if (n % 10 > 2 && n % 10 < 7)
                Count++;
            n = n / 10;

            }
        return Count;

        }


    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int i = getNumber(s);
        System.out.printf("The number of digits between 2 and 7 are %d", count2and7(i));
    }
    }


