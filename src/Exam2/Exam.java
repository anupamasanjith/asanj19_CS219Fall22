package Exam2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class Exam {
    public static String[] load_words(String path, int n) {
        // connect to the web page of speeds
        URL url = null;    // null is the "nothing value"
        Scanner s = null;

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // create an array of strings
        String[] words = new String[n];
        int i = 0;
        while (s.hasNextLine()) {
            words[i++] = s.nextLine();
        }
    return words;
    }

    public static boolean isPalindrome(String s) {
        if (s.length() < 2)
            return true;
        else if ((s.charAt(0) == s.charAt(s.length() - 1)) && isPalindrome(s.substring(1, s.length() - 1)))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String[] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt",
                2309);

        String[] palindrome = new String[9];
        int i = 0;
        for (String word : words) {
            if (isPalindrome(words[i]) == true) ;
            palindrome[i] = word;
            i++;
            System.out.print((Arrays.toString(palindrome)));
// is palindrome function works.
        }
    }

    }





