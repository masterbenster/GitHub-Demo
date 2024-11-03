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

         System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return;
        }

        System.out.println("The result is: " + result);
        scanner.close();
    }
}
