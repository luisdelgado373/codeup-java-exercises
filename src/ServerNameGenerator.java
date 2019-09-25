import java.util.Random;

public class ServerNameGenerator {
    static String[] adjectives = {
            new String("abandoned"),
            new String("babyish"),
            new String("calculating"),
            new String("damaged"),
            new String("each"),
            new String("fabulous"),
            new String("gargantuan"),
            new String("hairy"),
            new String("icky"),
            new String("jaded"),
    };

    static String[] nouns = {
            new String("people"),
            new String("history"),
            new String("way"),
            new String("art"),
            new String("world"),
            new String("information"),
            new String("map"),
            new String("two"),
            new String("family"),
            new String("government"),
    };
    public static String randomNouns() {
        int rnd = new Random().nextInt(nouns.length);
        return nouns[rnd];
    }

    public static String randomAdj() {
        int rnd = new Random().nextInt(adjectives.length);
        return adjectives[rnd];
    }
    public static void main(String[] args) {
        System.out.printf("Here is your server name: %s-%s", randomNouns(), randomAdj());
    }
}