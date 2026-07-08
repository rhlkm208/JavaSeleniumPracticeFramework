package StringPrograms;

public class FindLongestWordInAString {
    public static void main(String[] args) {
        String sentence = "Coding in Java is absolutely wonderful";
        System.out.println("Longest word: " + findLongestWord(sentence));
    }

    public static String findLongestWord(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return "";
        }

        // Split by one or more whitespace characters or punctuation marks
        String[] words = sentence.split("[\\s,.!?]+");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
