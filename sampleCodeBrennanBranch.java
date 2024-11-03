import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Split the sentence into words
        String[] words = sentence.split(" ");
        int wordCount = words.length;

        // Capitalize the first letter of each word
        StringBuilder capitalizedSentence = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                capitalizedSentence.append(Character.toUpperCase(word.charAt(0)))
                                   .append(word.substring(1)).append(" ");
            }
        }

        // Display the results
        System.out.println("Number of words: " + wordCount);
        System.out.println("Capitalized sentence: " + capitalizedSentence.toString().trim());
        
        System.out.println("Added functionality.....");

        scanner.close();
    }
}
