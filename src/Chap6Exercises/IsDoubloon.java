package Chap6Exercises;

public class IsDoubloon {
    public static boolean isDoubloon(String s) {
        for (int i = 0; i < s.length(); i++) {
            int cnt = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    cnt++;
                }
            }
                if (cnt < 2) {
                    return false;
            }
        }
        return true;
    }

    public static void main(String [] args){
        System.out.println(isDoubloon("dada"));
    }
   }
