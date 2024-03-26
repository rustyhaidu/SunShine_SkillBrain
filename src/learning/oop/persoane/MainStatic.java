package learning.oop.persoane;

public class MainStatic {

    public static void main(String[] args) {
        Persoana persoana = new Persoana();
        persoana.culoare = "alb";

        System.out.println(persoana.culoare);
        Persoana persoana2 = new Persoana();

        persoana2.culoare = "negru";
        System.out.println(persoana2.culoare);

        System.out.println(persoana.culoare);
    }
}
