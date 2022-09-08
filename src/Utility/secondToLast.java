package Utility;

public class secondToLast {

    public static int secondtolast(int n){
        n = Math.abs(n);
        return (n/10) % 10;
    }

    public static void main(String []args) {
        System.out.println(secondtolast(1234) );
        System.out.println(secondtolast(-4321) );
    }

}
