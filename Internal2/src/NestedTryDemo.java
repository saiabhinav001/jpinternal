public class NestedTryDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block.");
            int[] numbers = {1, 2, 3};

            try {
                System.out.println("Inner try block starts.");

                System.out.println(numbers[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("An ArrayIndexOutOfBoundsException occured: " + e.getMessage());

                try {
                    int result = 10 / 0;
                } catch (ArithmeticException e2) {
                    System.out.println("An ArithmeticException occured: " + e2.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes");
        }
        System.out.println("Program continues after nested try blocks");
    }
}
