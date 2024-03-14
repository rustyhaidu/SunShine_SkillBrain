package learning.stringuri;

public class FormatExample {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 30;
        double height = 1.75;
        // Formatting the string using format()
        String formattedString = String.format("Name: %s, Age: %d, Height: %.2f meters", name, age, height);
        // Displaying the formatted string
        System.out.println("Formatted string: " + formattedString);
    }
}

