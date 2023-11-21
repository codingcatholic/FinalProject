import java.util.Scanner;

// If-else statement questions:

public class if_else_questions{
    
    public static void main(String[] args) {
      // Create a program that detects if an integer is divisible by 2
      Scanner scanner = new Scanner(System.in);
      int user_num = scanner.nextInt();
      if (user_num % 2 == 0) {
        System.out.println("Number is even");
      }
      else {
        System.out.println("Number is odd");
      }
      // Create a program that takes two integers and finds the biggest and smallest of the two using if statements. Prints appropriate statement.
      int first_num = scanner.nextInt();
      int second_num = scanner.nextInt();

      if (first_num > second_num) {
        System.out.println("First number is bigger than second number");
      }
      else if (second_num > first_num) {
        System.out.println("Second number is bigger than first number");
      }
      else {
        System.out.println("Both numbers are equal");
      }
      // Create a program that detects if the length of user string is less than or equal to 10
      String user_str = scanner.nextLine();
      if (user_str.length() <= 10) {
        System.out.println("The length of " + user_str + " is less than or equal to 10 characters");
      }
      scanner.close();
    }
}