import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("Mango");
        fruits.remove("banana");
        fruits.add("grapes");

        System.out.println(fruits);
    }
}
