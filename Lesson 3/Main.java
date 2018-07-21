import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        uniqueWords();

        //-----------

        // Builder just for fun, I like it
        // Habit after Kotlin
        new Directory()
                .add("One", "+7000000000")
                .add("Two", "+7000000000")
                .add("Three", "+7000000000")
                .add("One", "+7000000100")
                .add("Four", "+7000000000")
                .getPrintln("One");

    }

    private static void uniqueWords() {
        String[] words = {
                "clap",
                "agile",
                "golden",
                "irksome",
                "beechnut",
                "conflicts",
                "amendments",
                "expansions",
                "avoidance",
                "aircraft",
                "irksome",
                "bladder",
                "golden",
                "agile",
                "elope",
                "clap"
        };

        Map<String, Integer> BDMap = new HashMap<>();

        for (String word : words) {
            BDMap.put(word, BDMap.getOrDefault(word, 0) + 1);
        }

        System.out.println(BDMap);
    }
}