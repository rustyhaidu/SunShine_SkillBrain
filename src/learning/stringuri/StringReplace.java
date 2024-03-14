package learning.stringuri;

public class StringReplace {
    public static void main(String[] args) {
        String text = "Ana are pere";
        String textFaraSpatii = text.replace(" ", "");
        System.out.println("Textul fara spatii este: " + textFaraSpatii);

        System.out.println("Lungimea textului fara spatii: " + textFaraSpatii.length());
    }
}
