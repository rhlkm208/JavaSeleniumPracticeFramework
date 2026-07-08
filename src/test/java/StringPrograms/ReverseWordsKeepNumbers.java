package StringPrograms;

public class ReverseWordsKeepNumbers {

    public static void main(String[] args) {

        String str = "test1234epam6789";

        StringBuilder result = new StringBuilder();
        String word = "";

        for (char ch : str.toCharArray()) {

            if (Character.isLetter(ch)) {
                word = word + ch;
            } else {

                if (!word.isEmpty()) {
                    result.append(new StringBuilder(word).reverse());
                    word = "";
                }

                result.append(ch);
            }
        }

        // Handle last word if present
        if (!word.isEmpty()) {
            result.append(new StringBuilder(word).reverse());
        }

        System.out.println(result);
    }
}