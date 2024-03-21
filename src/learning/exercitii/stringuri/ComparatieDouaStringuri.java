package learning.exercitii.stringuri;

import java.util.Scanner;

public class ComparatieDouaStringuri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdul primul string :");
        String string1 = scanner.nextLine();
        System.out.println("Al doilea primul string :");
        String string2 = scanner.nextLine();
        boolean suntLaFel =suntLaFel(string1,string2);
        System.out.println("Sunt la fel: " + suntLaFel );
        String rezultat = compareStringuri(string1,string2);

        System.out.println(rezultat);

    }
    public static boolean suntLaFel(String str1, String str2){
        return str1.equals(str2);
    }
    public static String compareStringuri(String str1, String str2){
        int rezultat = str1.compareTo(str2);
        if (rezultat<0){
            return str1 + " este inaintea lui " + str2;
        }else if (rezultat>0){
            return str1 + " este dupa lui " + str2;
        }else {
            return str1 + " este egal cu " + str2;
        }
    }

}
