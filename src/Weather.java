public class Weather {
    public static double weather(double t, // Temperature
                                 double v) { // Velocity in MPH
        return 35.74 + 0.6215*t + ((0.4275*t)-(35.75)) * Math.pow(v, 0.16);

    }

    public static void main (String [] args) {
        System.out.println(weather(32,10));

    }
}
