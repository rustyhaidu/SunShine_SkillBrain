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
        //interschimbare();
        interschimbareCuVariabilaNoua();
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }

    public static void interschimbare() {
        a = a + b;
        b = a - b;
        a = a - b;

    }

    // Sa interschimbam valoarea din 2 variabile folosind o a treia variabila, citind de la tastatura
    public static void interschimbareCuVariabilaNoua() {
        int c;
        c=a;
        a=b;
        b=c;

    }



}
