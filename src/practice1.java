import java.util.Arrays;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;

public class practice1 {
    public static String [] load_words(String path, int n) {
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
        String [] words = new String[n];
        int i = 0;
        while (s.hasNextLine()) {
            words[i++] = s.nextLine();
        }

        return words;
    }
    public static char[] make_array(String s) {
        char[] aoc = new char[s.length()];
        for (int i = 0; i < aoc.length; i++) {
            for (int j = 0; j < s.length(); j++) {
                // when i = j, character at index j in string s is character at index i of array.
                if (i == j) {
                    aoc[i] = s.charAt(j);
                }
            }
        }
        return aoc;
    }
    public static String back_to_string(char[] aoc) {
    String x = "";
        for (int i = 0; i < aoc.length; i++) {
        x+=aoc[i];
        }
        return x;
    }
 public static String jumble(String s){
        char[] aoc = make_array(s);
     for (int i = 0; i < aoc.length-1; i++) {
         char temp = aoc[i];
         aoc[i] = aoc[i+1];
         aoc[i+1] = temp;

     }
     return back_to_string(aoc);
    }




    public static void main(String[] args) {
        String[] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt",
                2309);
        Random rng = new Random();
        rng.setSeed(23);
        String answer = words[rng.nextInt(0, words.length)];
        System.out.println(answer);
        System.out.println(jumble(answer));
        Scanner s = new Scanner(System.in);
        String guess = "";
        while(true){
            System.out.print("Enter your guess: ");
            guess = s.nextLine();
            if (guess.equals(answer)){
                System.out.print("Winner!");
                break;
            } else{
                System.out.println("Wrong guess, try again.");
            }
        }

    }

}