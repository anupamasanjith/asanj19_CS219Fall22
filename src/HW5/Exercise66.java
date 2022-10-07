package HW5;

public class Exercise66 {
    public static boolean canSpell(String word, String tiles) {
        String x = ""; // empty string declared
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < tiles.length(); j++) {
                if (word.charAt(i) == tiles.charAt(j)) {
                    tiles = tiles.substring(0, j) + tiles.substring(j + 1); // delete letter.
                    x += word.charAt(i); // fill empty string with deleted letters.
                }

            }
            if (word.equals(x)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canSpell("boot", "axobasrto"));
        System.out.println(!canSpell("hippo", "haxobapsrito"));
        // my own checks
        System.out.println(canSpell("boot", " xaojbstro"));
        System.out.println(!canSpell("lydia", " aytihglld"));
        System.out.println(canSpell("lupi", "otrylhhpufgi"));
        System.out.println(canSpell("bees", "tyseb"));

    }
}
