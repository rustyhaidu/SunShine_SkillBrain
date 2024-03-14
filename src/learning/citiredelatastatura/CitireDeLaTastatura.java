package learning.citiredelatastatura;

import java.util.Scanner;

public class CitireDeLaTastatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un text de la tastatura:");
        String inputDeLaTastatura = scanner.nextLine();
        //System.out.println(inputDeLaTastatura);

        if(inputDeLaTastatura.equals("kiwi")){
            System.out.println("Ati introdus cuvantul corect!");
        }

        System.out.println("Introduce un numar: ");
        //int numar = scanner.nextInt();
        String numarText = scanner.nextLine();
        int numar = Integer.parseInt(numarText);
        System.out.println(numar);
    }
}
