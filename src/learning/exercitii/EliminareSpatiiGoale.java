package learning.exercitii;

import java.util.Scanner;

public class EliminareSpatiiGoale {
    public static void main(String[] args) {
        Scanner cititor= new Scanner(System.in);
        System.out.println(" Introduceti text");
        String textCitit= cititor.nextLine();
        String eliminaSpatiiGoale= textCitit.trim();
        System.out.println("Noul tau text " +eliminaSpatiiGoale );
    }
}
