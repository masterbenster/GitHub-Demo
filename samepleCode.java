import java.util.Scanner;

public class PersonalizedMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the user's name
        System.out.print("Please Give Your Name: ");
        String name = scanner.nextLine();

        // Get the user's age
        System.out.print("Please Enter Your Age: ");
        int age = scanner.nextInt();

        // Calculate the birth year
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        int birthYear = currentYear - age;

        // Reverse the birth year as a string
        String birthYearStr = Integer.toString(birthYear);
        String reversedBirthYear = new StringBuilder(birthYearStr).reverse().toString();

        // Display the message
        System.out.println("Hi there, " + name + "! Based on your age, you were born in " + birthYear + ".");
        System.out.println("Your birth year in reverse is: " + reversedBirthYear);

        scanner.close();
    }
}
