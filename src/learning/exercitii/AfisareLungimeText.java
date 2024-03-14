package learning.exercitii;

import java.util.Scanner;

public class AfisareLungimeText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti textul: ");
        String text1 = scanner.nextLine();
        int lungime = text1.length();

        System.out.println("Lungimea textului este de " + lungime);
    }
}
