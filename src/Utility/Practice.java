package Utility;

public class Practice {
    public static String Equal(String s) {
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
        return s;
    }
    public static void main(String[]args){
        Equal("abba");
    }
}
