package HW6;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;


public class SwallowStats {
    public static void swallow_stats() {
        // connect to the webpage of speeds.
        URL url = null; // uniform resource locator
        Scanner s = null; // null is the "nothing" value.
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt"; // https = hypertext transfer protocol secure.

        try {
            url = new URL(path); // create a URL object for the path.
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // what is true??
        // able to connect.
        // read each line of the web-file.
        double sum = 0;
        int count = 0;
        double min = Double.POSITIVE_INFINITY;
        double max = -Double.POSITIVE_INFINITY;
        while (s.hasNextLine()) {
            String line = s.nextLine();// read a line of the website.
            if (!line.contains("#") && !line.isEmpty()) { // calling .isEmpty to eliminate blank lines.
                sum = sum + Double.parseDouble(line);
                count++;
                if (min > Double.parseDouble(line)) {
                    min = Double.parseDouble(line);
                }
                if (max < Double.parseDouble(line)) {
                    max = Double.parseDouble(line);
                }
            }
        }
        double avg = sum / count;
        System.out.printf("The average swallow speed is %.2f\n" + "The minimum swallow speed is %.1f\n" +
                "The maximum swallow speed is %.1f", avg, min, max);


    }

    public static void main(String[] args) {
        swallow_stats();

    }
}
