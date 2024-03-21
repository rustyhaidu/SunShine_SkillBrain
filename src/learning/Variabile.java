package learning;

public class Variabile {
    /**
     * comment
     * Tipuri variabile
     * 1. Locale
     * 2. De instanta
     * 3. Statice
     */

    static int nr = 10;
    static String text = "Textul meu";


    public static void main(String[] args) {
        int numar = 11;
        nr = 11;
        System.out.println(Variabile.nr);

        String nume = "vasile";
        String prenume = "ion";
        System.out.println(nume + " "+ prenume);
    }
}
