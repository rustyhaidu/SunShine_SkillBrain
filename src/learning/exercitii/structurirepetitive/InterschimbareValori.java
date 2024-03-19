package learning.exercitii.structurirepetitive;

import java.util.Scanner;

/**
 * How to swap two values without using 3rd variable: a and b will be
 * read from keyboard.
 */
public class InterschimbareValori {
    static int a;
    static int b;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        a = scanner.nextInt();
        System.out.println("Introduceti al doilea numar: ");
        b = scanner.nextInt();
        interschimbare();
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }

    public static void interschimbare() {
        a = a + b;
        b = a - b;
        a = a - b;

    }

}
