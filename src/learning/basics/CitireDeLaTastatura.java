package learning.basics;

import java.util.Scanner;

public class CitireDeLaTastatura {
    public static void main(String[] args) {
        System.out.println("Introduceti text");
        Scanner scanner = new Scanner(System.in);
        String textDeLaTaste = scanner.nextLine();

        System.out.println("A fost printat: " + textDeLaTaste);
    }
}
