package learning.basics;

public class Metode {
    public static void main(String[] args) {
        print("Hello World");
        String nume = "Pop";
        String prenume = "Vasile";
        String numeComplet = numeSiPrenumeConcatenat(nume, prenume);
        System.out.println(numeComplet);
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static String numeSiPrenumeConcatenat(String nume, String prenume) {
        return nume + " " + prenume;
    }
}
