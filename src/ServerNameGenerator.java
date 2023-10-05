import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {

    private static String[] randomAdjectives = {"used", "depressed", "efficient", "jumpy", "impartial", "fine", "seemly", "dramatic", "yummy", "smooth"};


    private static String[] randomNouns = {"minister", "cook", "river", "drawer", "interest", "vein", "knee", "apparel", "girls",
            "mailbox"};

    public static String getRandomElement(String[] array) {
        Random rand = new Random();
        int index = rand.nextInt(array.length);
        return array[index];
    }

    public static void main(String[] args) {
        String adjective = getRandomElement(randomAdjectives);
        String noun = getRandomElement(randomNouns);
        String serverName = adjective + "-" + noun;
        System.out.println("Generated server name: " + serverName);
    }
}








