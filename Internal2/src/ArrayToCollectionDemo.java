import java.util.Arrays;
import java.util.List;

public class ArrayToCollectionDemo {
    public static void main(String[] args) {
        // Create an array of strings
        String[] fruitsArray = {"Apple", "Banana", "Mango", "Orange"};

        // Convert the array to a collection (List) using Arrays.asList()
        List<String> fruitsList = Arrays.asList(fruitsArray);

        // Display the collection
        System.out.println("Converted Collection (List): " + fruitsList);

        // Demonstrate iteration over the collection
        System.out.println("Iterating over the collection:");
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }

        // Modifying the array will reflect in the collection (since it's backed by the array)
        fruitsArray[0] = "Grapes";
        System.out.println("Collection after modifying the array: " + fruitsList);

        // Adding or removing elements directly to/from the collection is not allowed
        try {
            fruitsList.add("Pineapple");
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: Cannot add elements to the fixed-size list.");
        }
    }
}
