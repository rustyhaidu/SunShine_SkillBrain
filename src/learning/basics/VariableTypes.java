package learning.basics;

/**
 * Tipuri de variabile
 * 1. Locale ( in interiorul functiilor)
 * 2. De instanta (le putem folosi doar daca avem o instanta
 * a acelei clase din care face parte
 * 3. Statice (pe care le putem apela fara instanta)
 */
public class VariableTypes {
    static int nr = 10;
    static String text = "Textul meu";
    /* static String text2 = new String("Test");
     -- in context OOP asa ne declaram si initilizam un obiect
     */
    public static void main(String[] args) {
        int numar = 12;
        nr = 11;
        System.out.println(VariableTypes.nr);
        System.out.println(numar);
    }
}
