 import java.util.Scanner;

public class IT24100571Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input and validate exam marks
        double examMarks = getValidatedMarks(scanner, "Enter the exam marks (out of 100): ");
        // Input and validate lab submission marks
        double labMarks = getValidatedMarks(scanner, "Enter the lab submission marks (out of 100): ");
        
        // Input and validate percentages
        double examPercentage = getValidatedPercentage(scanner, "Enter the percentage taken from exam marks: ");
        double labPercentage = getValidatedPercentage(scanner, "Enter the percentage taken from lab submission marks: ");

        // Check if percentages add up to 100
        if (examPercentage + labPercentage != 100) {
            System.out.println("Error: The percentages should add up to 100.");
        } else {
            // Calculate the final mark
            double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
            System.out.printf("The final mark of the module is: %.2f\n", finalMark);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to input and validate marks
    private static double getValidatedMarks(Scanner scanner, String prompt) {
        double marks;
        while (true) {
            System.out.print(prompt);
            marks = scanner.nextDouble();
            if (marks >= 0 && marks <= 100) {
                break;
            } else {
                System.out.println("Invalid input. Marks should be between 0 and 100.");
            }
        }
        return marks;
    }

    // Method to input and validate percentage
    private static double getValidatedPercentage(Scanner scanner, String prompt) {
        double percentage;
        while (true) {
            System.out.print(prompt);
            percentage = scanner.nextDouble();
            if (percentage >= 0 && percentage <= 100) {
                break;
            } else {
                System.out.println("Invalid input. Percentage should be between 0 and 100.");
            }
        }
        return percentage;
    }
}