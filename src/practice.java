import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;
public class practice {
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
public static void wordle_cheat(String [] words) {
    for (String word : words) {
        if (word.length() == 5 && word.charAt(0) == 't' && word.charAt(4) == 'r' ) {
            String middle = word.substring(1, 4);
            if (middle.indexOf('s') > -1) {
                System.out.println(word);

            }
        }
        else {
            System.out.println("There are no words like this");
            break;
        }
    }
}

    public static void main(String[] args) {
        String [] x = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt",
                2309);
        wordle_cheat(x);
    }
}
