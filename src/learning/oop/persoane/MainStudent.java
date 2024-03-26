package learning.oop.persoane;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.scoala = new Scoala();
        student.scoala.nume = "UBB";
        student.varsta = 24;
        System.out.println("Varsta este: " + student.varsta);

        Angajat angajat = new Angajat();
        angajat.locDeMunca = "NTT";

        System.out.println("Loc de munca: " + angajat.locDeMunca);
    }
}
