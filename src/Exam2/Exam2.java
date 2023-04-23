package Exam2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.Arrays;

public class Exam2Redo {
    public static String[] reverse(String[] arr) { // function to reverse an array of strings.

        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    public static boolean isPalindrome(String s) { // function to check if string is a palindrome or not.
        if (s.length() < 2)
            return true;
        else if ((s.charAt(0) == s.charAt(s.length() - 1)) && isPalindrome(s.substring(1, s.length() - 1)))
            return true;
        else
            return false;
    }

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

        String[] words = new String[n];
        int i = 0;
        while (s.hasNextLine()) {
            String nextLine = s.nextLine();
            if (isPalindrome(nextLine)) { // if a words is a palindrome in the website.
                words[i] = nextLine;// palindrome word becomes string at index i of words array
                i++;
            }
        }

        return words;
    }

    public static void main(String[] args) {
        String[] palindromes = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt",
                9); // 9 total palindromes present.
        System.out.println(Arrays.toString(reverse(palindromes))); // reversed array of palindromes.
    }
}
