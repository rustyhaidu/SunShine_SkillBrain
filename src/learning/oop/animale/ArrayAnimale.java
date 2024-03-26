package learning.oop.animale;

public class ArrayAnimale {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        Animal animal1 = new Animal();
        animal1.nume = "Rex";
        animal1.varsta = 4;

        Animal dog = new Dog();
        dog.nume = "totto";
        dog.varsta = 2;
        ((Dog) dog).rasa = "bichon";

        Animal dog2 = new Dog();
        dog2.nume = "negro";
        dog2.varsta = 3;
        ((Dog) dog2).rasa = "puddle";

        Animal cat = new Cat();
        cat.nume = "Pisi";

        animals[0] = animal1;
        animals[1] = dog;
        animals[2] = dog2;
        animals[3] = cat;

        for (Animal animal : animals) {
            System.out.println("Nume: "  + animal.nume);

            if(animal instanceof Dog){
                System.out.println("Rasa:" + ((Dog) animal).rasa);
            }

            if(animal instanceof Cat){
                System.out.println(((Cat) animal).sunet);
            }
        }
    }
}
