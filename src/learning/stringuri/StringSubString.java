package learning.stringuri;

public class StringSubString {
    public static void main(String[] args) {
        String text = "Ana are mere";

        String mere = text.substring(8);
        System.out.println("Din text am extras substring-ul: " + mere);

        String are = text.substring(4,7);
        System.out.println("Din text am extras substring-ul: " + are);
    }
}
