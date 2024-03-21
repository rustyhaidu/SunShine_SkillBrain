package learning.exercitii.structurirepetitive;

import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti un numar");
        int nr1 = scanner.nextInt();
        System.out.println("introduceti un numar");
        int nr2 = scanner.nextInt();
        scanner.close();
        String esteParNr1 = estePar(nr1);
        String esteParNr2 = estePar(nr2);
        System.out.println("numarul1 : " + esteParNr1);
        System.out.println("numarul2 : " + esteParNr2);
    }

    public static String estePar(int numar) {
        boolean par = numar % 2 == 0;
        if (par) {
            return "este par";
        } else {
            return "este impar";
        }
    }
}
