import java.util.Scanner;

public class IT24100571Lab4Q3 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the number from the keyboard
        double number = scanner.nextDouble();

        // Use ternary operator to determine if the number is Positive, Negative, or Zero
        String result = (number > 0) ? "The number is: Positive" :
                        (number < 0) ? "The number is: Negative" :
                        "The number is: Zero";

        // Display the result
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }
}