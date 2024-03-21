package learning.exercitii.structurirepetitive;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introducere numar: ");
        int numar = scanner.nextInt();
        long produs = factorial(numar);
        System.out.println("Factorialul lui " + numar + " este: " + produs);
    }

    public static long factorial(int numar) {
        long produs = 1;
        for (int i = 1; i <= numar; i++) {
            produs = produs * i;
        }
        return produs;
    }
}
