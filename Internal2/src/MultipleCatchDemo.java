public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            // Array to demonstrate different exceptions
            int[] numbers = new int[5];

            System.out.println("Starting the operations...");

            // Potentially throws ArrayIndexOutOfBoundsException
            numbers[10] = 50;

            // Potentially throws ArithmeticException
            int result = 10 / 0;

            // Potentially throws NullPointerException
            String str = null;
            System.out.println(str.length());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds: " + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());

        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());

        } catch (Exception e) {
            // This is a general catch block for any other exceptions
            System.out.println("General Exception: " + e.getMessage());

        } finally {
            System.out.println("Finally block always executes");
        }

        System.out.println("Program continues after exception handling");
    }
}
