package learning.oop.animale;

public class MainAnimale {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.nume = "Rex";
        animal1.varsta = 4;
        System.out.println("nume: " + animal1.nume);
        System.out.println("varsta: " + animal1.varsta);

        Dog dog = new Dog();
        dog.nume = "totto";
        dog.varsta = 2;
        dog.rasa = "bichon";
        System.out.println("nume:" + dog.nume);
        System.out.println("varsta:" + dog.varsta);
        System.out.println("rasa:" + dog.rasa);





    }
}
