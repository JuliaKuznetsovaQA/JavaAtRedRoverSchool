import java.util.*;

public class HW12 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Tan");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Red");
        colors.add("Pink");
        colors.add("Purple");
        colors.add("Blue");
        System.out.println(colors);

        for (int i = 0; i < colors.size(); i++) {
            if (colors.get(i).contains("l")) {
                colors.remove(i);
            }
        }

        System.out.println(colors);
        System.out.println("==========================");

        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 100; i < 1001; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        System.out.println(numbers.size());

        numbers.removeIf(nextInt -> nextInt % 2 == 0);

        System.out.println(numbers);
        System.out.println(numbers.size());

        System.out.println("=======================");

        List<String> words = new ArrayList<>(Arrays.asList(
                "rob",
                "notorious",
                "formation",
                "tent",
                "eject",
                "just",
                "chair",
                "sweet",
                "retire",
                "reproduction",
                "hip",
                "offensive",
                "tendency",
                "polish",
                "knowledge",
                "flex",
                "quaint",
                "urine",
                "labour",
                "grandmother",
                "sheet",
                "banish",
                "substitute",
                "cage",
                "threat",
                "title",
                "hut",
                "appointment",
                "disappear",
                "voter"));

        Map<Character, String> wordsByAlphabet = new HashMap<>();
        for (String word : words) {
            Character c = word.charAt(0);
            String longestWord = "";
            if (wordsByAlphabet.get(c) != null) {
                longestWord = wordsByAlphabet.get(c);
            }
            if (word.length() > longestWord.length()) {
                wordsByAlphabet.put(c, word);
            }
        }
        System.out.println(wordsByAlphabet);

    }
}
