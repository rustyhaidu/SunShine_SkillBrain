package learning.oop.persoane;

public class MainPersoana {
    public static void main(String[] args) {
        Persoana persoana = new Persoana();
        persoana.nume = "Popescu";
        persoana.prenume = "Ioan";
        System.out.println("Numele persoanei este: " + persoana.nume + " "+ persoana.prenume);
        persoana.varsta = 30;
        System.out.println("Varsta actuala: " + persoana.varsta);
        persoana.aniversare();
        System.out.println("Varsta dupa aniversare: " + persoana.varsta);
        Adresa adresa = new Adresa();
        adresa.strada = "Principala";
        adresa.numar = 13;
        persoana.adresa= adresa;
        System.out.println("Adresa lui " +persoana.nume + " "+ persoana.prenume + " este: " + persoana.adresa.strada+ " "+ persoana.adresa.numar );


    }


}


