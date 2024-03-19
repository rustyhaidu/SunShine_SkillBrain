package learning.stringuri;

public class StringCharAt2 {
    public static void main(String[] args) {
        String text1 = "Skillbrain";
        char caracterulReturnat = text1.charAt(text1.length() - 1);
        System.out.println("Pe pozitia " + text1.length() +
                " se afla caracterul: " + caracterulReturnat);
    }
}
