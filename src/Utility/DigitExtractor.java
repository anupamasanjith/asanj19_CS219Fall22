package Utility;

public class DigitExtractor {
    public static int last(int n) {
        if(n<0){
            n = -n; // not mathematically read. Could use math(absolute).

        }
        return n% 10;
    }
    public static void main(String []args) {
        System.out.println(last(2753) == 3);
        System.out.println(last(-749) ==9);
    }

}
