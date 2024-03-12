package learning.basics;

public class StringConversie {

    public static void main(String[] args) {
        int numar = 15;
        String conversieLaString = String.valueOf(15);
        // nu trebuie sa adaugi caracterul gol asa
        String numarText = "30";
        System.out.println(numar + 16 + " conversie");
        // mai intai se face adunarea si apoi conversia
        System.out.println("conversie" + numar + 16);
        // mai intai se face conversia la String

        int numarConvertit = Integer.parseInt(numarText);

        System.out.println("Suma dintre doua numere este: " +
                (numarConvertit + 31));
    }
}
