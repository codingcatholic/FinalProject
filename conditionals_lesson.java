// Lesson: Switch and If-Else Statements in Java
// By: Sean

import java.util.Scanner;

public class conditionals_lesson{
    // Welcome back to another venture into the new but familiar world of Java! Today, we are learning about the different logical and boolean operators in Java
    // There are two main types of boolean operators: switch and if-else statements
    public static void main(String[] args) {
        // If-Else Statement
        // Runs block of code if the if condition is True
        boolean is_registered = true;
        // Get the user's age as input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Use if-else statement to determine age category
        if (age < 0){ // Detects if age is less than 0 and prints error

            System.out.println("Invalid age. Please enter a positive value.");
        } else if (age < 18) { // Detects if age is less than 18
            if (is_registered) { // if statements can be written inside if statements. This is known as a nested loop.
              System.out.println("You are a registered minor.");
            }
            System.out.println("You are a minor.");
        } else if (age < 65) { // Detects if age is less than 65
            System.out.println("You are an adult.");
        } else if (age == 0 && is_registered) {
            System.out.println("You are a baby");
        } else { // Else runs if it does fulfill any other if statement
            System.out.println("You are a senior citizen.");
        }

        // Switch Statement
        // Compares multiple cases and matching ones have their code block executed
        // Get the day of the week as input (1-7, where 1 is Sunday and 7 is Saturday)
        System.out.print("Enter the day of the week (1-7): ");
        int dayOfWeek = scanner.nextInt();

        // Use switch statement to determine the day's name
        String dayName;
        // Matches the user input to a specific case and prints appropriate weekday
        switch (dayOfWeek) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        // Display the day's name
        System.out.println("Day of the week: " + dayName);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
