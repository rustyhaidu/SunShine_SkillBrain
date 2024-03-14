package learning.stringuri;

public class StringExample {
    public static void main(String[] args) {
        int number = 10;
        String text = "exemplu";
        String numarConvertitLaString = String.valueOf(number);

        String text1 = "mere";
        String text2 = "pere";

        boolean rezultatComparare = text1.equals(text2);

        if (rezultatComparare) {
            System.out.println("Sunt egale: " + rezultatComparare);
        } else {
            System.out.println("Sunt egale: " + rezultatComparare);
        }
    }
}
