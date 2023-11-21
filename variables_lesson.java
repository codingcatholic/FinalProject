// Lesson: Variables and Data Types in Java
// By: Sean 

// Welcome into the new but familiar world of Java! Today, we are learning about different data types and arithmetic operations
// Java is a strongly-typed language, which means that every variable must have a declared data type.

// Import Scanner package to take user input
import java.util.Scanner;
// Import random package to generate random numbers
import java.util.Random;

public class variables_lesson {

    public static void main(String[] args) {
        // Declare and initialize variables

        // Can take user input using Scanner
        Scanner scanner = new Scanner(System.in);
      
        // Can generate random using rand
        Random rand = new Random();
        int age = scanner.nextInt();
      

        // Double data type (64 bits, used for decimal numbers)
        double height = rand.nextDouble();

        // Character data type (16 bits)
        char gender = 'M';

        // Boolean data type (true or false)
        boolean is_student = true;

        // String data type (a sequence of characters)
        String name = "Sean";

        // Display the values of the variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Gender: " + gender);
        System.out.println("Is Student? " + is_student);

        // Changing variable values
        age = 26;
        height = 6.0;
        is_student = false;

        // Display the updated values

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Gender: " + gender);
        System.out.println("Is Student? " + is_student);

        // Type casting
        // Java requires explicit casting when converting between certain data types.

        // Convert double to int (Narrowing casting, requires a data type to be declared)

        int newAge = (int) height;
        System.out.println("\nConverted Age (from double to int): " + newAge);

        // Convert int to double (Widening casting, no data type in brackets)

        double newHeight = age;
        System.out.println("Converted Height (from int to double): " + newHeight);

        // Arithmetic operators

        // Addition: +
        // Subtraction: -
        // Multiplication: *
        // Division: /
        // Modulus: % (returns remainder of division)

        // Display results of arithmetic operations

        System.out.println(age + 5);
        System.out.println(height - 1.3);
        System.out.println(age * 2);
        System.out.println(height / 2);
        System.out.println(age % 3);

        // Increment and Decrement operators
        age++; // Increment age by 1
        height--; // Decrement height by 1

        // Display results after increment and decrement

        System.out.println("Updated Age: " + age);
        System.out.println("Updated Height: " + height);

        scanner.close(); // Closed to avoid data leaks
    }  
}









