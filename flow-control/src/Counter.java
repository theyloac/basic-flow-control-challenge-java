import java.util.Scanner;

// Main class
public class Counter {
    public static void main(String[] args) {
        // Creating a Scanner object to read user input
        Scanner terminal = new Scanner(System.in);

        // Prompting and reading the first parameter from the user
        System.out.println("Enter the first parameter");
        int firstParameter = terminal.nextInt();

        // Prompting and reading the second parameter from the user
        System.out.println("Enter the second parameter");
        int secondParameter = terminal.nextInt();

        try {
            // Calling the count method with the two parameters
            count(firstParameter, secondParameter);
        } catch (InvalidParametersException exception) {
            // Print the message defined in the exception
            System.out.println(exception.getMessage());
        }
    }

    // Static method to perform the counting
    static void count(int firstParameter, int secondParameter) throws InvalidParametersException {
        // Check if the first parameter is greater than the second
        if (firstParameter > secondParameter) {
            // Throw the custom exception if the condition is true
            throw new InvalidParametersException();
        }

        // Calculate the difference between the two parameters
        int count = secondParameter - firstParameter;

        // Loop to print numbers from 1 to the calculated difference
        for (int i = 1; i <= count; i++) {
            System.out.println("Printing number " + i);
        }
    }
}

// Class representing the custom exception
class InvalidParametersException extends Exception {
    // Constructor of the exception class
    public InvalidParametersException() {
        // Calling the constructor of the parent class (Exception) with a custom message
        super("The second parameter must be greater than the first");
    }
}
