import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class UserDefinedExceptionDemo {
    public static void checkAge(int age) throws InvalidAgeException{
        if (age < 18) {
            throw new InvalidAgeException("Age is less than 18. Not eligible");
        } else {
            System.out.println("Eligible for voting");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            checkAge(age);
            System.out.println("You are eligible to proceed");
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed");
        }
    }
}
