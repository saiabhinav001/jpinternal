import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Java8FeaturesDemo {

    // Functional interface with a single abstract method
    @FunctionalInterface
    interface Greeting {
        void sayHello(String name);
    }

    // Method to demonstrate Method Reference
    public static void staticGreet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        // a) Lambda Expressions
        System.out.println("Using Lambda Expressions:");
        Greeting greetLambda = (name) -> System.out.println("Hello, " + name + "!");
        greetLambda.sayHello("Alice");

        System.out.println();

        // b) Method References
        System.out.println("Using Method References:");
        Greeting greetMethodRef = Java8FeaturesDemo::staticGreet; // Reference to static method
        greetMethodRef.sayHello("Bob");

        System.out.println();

        // c) Functional Interfaces and Built-in Functional Interfaces
        System.out.println("Using Built-in Functional Interface (Consumer):");
        List<String> names = new ArrayList<>();
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        // Using Lambda Expression
        names.forEach((name) -> System.out.println("Name: " + name));

        System.out.println();

        // Using Method Reference
        System.out.println("Using Method Reference with forEach:");
        names.forEach(System.out::println); // Reference to an instance method
    }
}
