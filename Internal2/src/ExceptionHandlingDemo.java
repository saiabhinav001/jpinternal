public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        // Array to demonstrate ArrayIndexOutOfBoundsException
        int[] numbers = {1, 2, 3};

        try {
            // This block contains code that might throw exceptions
            System.out.println("Inside try block");

            // Attempting to access array index that doesn't exist
            System.out.println("Accessing array element: " + numbers[5]);

            // This code won't execute if above line throws exception
            System.out.println("This won't be printed");

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling specific exception
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());

        } catch (Exception e) {
            // Handling any other exceptions
            System.out.println("Caught general exception: " + e.getMessage());

        } finally {
            // This block always executes, whether exception occurs or not
            System.out.println("Finally block executed");
        }

        // Demonstrating multiple exceptions
        try {
            System.out.println("\nDemonstrating another try block");

            // Attempting to divide by zero
            int result = 10 / 0;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());

        } finally {
            System.out.println("Second finally block executed");
        }

        System.out.println("\nProgram continues after exception handling");
    }
}

