package learning.basics;

/**
 * git init
 * git add README.md
 * git commit -m "first commit"
 * git branch -M main
 * git remote add origin https://github.com/rustyhaidu/PrimulProiect.git
 * git push -u origin main
 */
public class Main {
    public static void main(String[] args) {

        /*String textLung = "Heello World!";

        System.out.println(textLung);*/

        String numeComplet = Metode.numeSiPrenumeConcatenat("Popescu", "Ciprian");
        System.out.println("Nume complet: " + numeComplet);

    }
}