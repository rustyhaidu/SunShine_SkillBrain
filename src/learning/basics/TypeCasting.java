package learning.basics;

public class TypeCasting {
    public static void main(String[] args) {
        double numarCuVirgula = 5.7;
        int nrIntreg = (int) numarCuVirgula;

        // System.out.println(nrIntreg);

        /*System.out.println(7 / (double) 3);//conversie la double
        System.out.println(7.0 / 3); //conversie la double
        System.out.println(7 / 3.0); //conversie la double

        System.out.println(111 % 2); // restul impartiri lui 111 la 2*/

        int numarIntreg = 10;
        /*numarIntreg = numarIntreg + 1; // incrementare cu 1
        System.out.println("Numar incrementat: " + numarIntreg);
        numarIntreg = numarIntreg - 2; // decrementare cu 2
        System.out.println("Numar decrementat: " + numarIntreg);
        numarIntreg++;
        System.out.println("Numar incrementat: " + numarIntreg);
        numarIntreg--;
        System.out.println("Numar decrementat: " + numarIntreg);*/
        /* ++numarIntreg;
        System.out.println("Numar incrementat: " + numarIntreg);
        --numarIntreg;
        System.out.println("Numar decrementat: " + numarIntreg);*/

        //System.out.println("Numar incrmentat pe aceeasi linie: " + numarIntreg++);
        //System.out.println("Numar incrmentat pe aceeasi linie: " + ++numarIntreg);

        numarIntreg+=3; // incrementare cu orice numar
        System.out.println(numarIntreg);
    }
}
