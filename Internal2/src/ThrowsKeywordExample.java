import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsKeywordExample {

    // Method that declares an exception using throws
    public static void readData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String name = reader.readLine(); // May throw IOException
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        try {
            // Calling the method that might throw IOException
            readData();
        } catch (IOException e) {
            // Handling the exception
            System.out.println("An error occurred while reading input: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}

