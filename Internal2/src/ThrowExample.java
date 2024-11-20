import java.util.Scanner;

public class ThrowExample {
    // Method to validate age
    public static void validateAge(int age) {
        if (age < 18) {
            // Throwing an exception explicitly
            throw new IllegalArgumentException("Age must be 18 or above to proceed.");
        } else {
            System.out.println("Age validated successfully.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Calling the method that might throw an exception
            validateAge(age);
            System.out.println("You are eligible to proceed.");
        } catch (IllegalArgumentException e) {
            // Handling the exception
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
}

