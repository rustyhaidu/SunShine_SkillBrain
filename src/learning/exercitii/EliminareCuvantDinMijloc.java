package learning.exercitii;

import java.util.Scanner;

public class EliminareCuvantDinMijloc {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduceti un text: " );
        String text = scanner.nextLine();
        String[] array = text.split(" ");
        String textConcat = array[0]+ " " + array[2];
        System.out.println("Textul nostru: "+textConcat);
        String primulCuvant = text.substring(0,3);
        String alTreileaCuvant = text.substring(8);
        String textConcat2 = primulCuvant + " " + alTreileaCuvant;
        System.out.println("Textul nostru2: " + textConcat2);
    }

}
