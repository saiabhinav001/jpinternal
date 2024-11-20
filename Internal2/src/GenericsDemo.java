// Generic class
class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

// Class with a generic method
class Utility {
    public static <T> void printItem(T item) {
        System.out.println("Item: " + item);
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        // Using the generic class
        Box<String> stringBox = new Box<>("Hello");
        System.out.println("Box contains: " + stringBox.getItem());

        Box<Integer> intBox = new Box<>(123);
        System.out.println("Box contains: " + intBox.getItem());

        // Using the generic method
        Utility.printItem("Generic Method Example");
        Utility.printItem(456);
    }
}