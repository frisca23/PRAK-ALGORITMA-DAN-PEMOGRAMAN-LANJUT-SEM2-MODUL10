import java.util.Arrays;
public class ContainsExample {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "cherry", "date"};
        String item = "cherry";
        boolean ada = Arrays.asList(array).contains(item);
        if (ada) {
            System.out.println(item + " ada dalam array");
        } else {
            System.out.println(item + " tidak ada dalam array");
        }
    }
}