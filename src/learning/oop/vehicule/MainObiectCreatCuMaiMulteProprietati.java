package learning.oop.vehicule;

import learning.oop.vehicule.Car;

public class MainObiectCreatCuMaiMulteProprietati {
    public static void main(String[] args) {
        Car car1 = new Car("BMV");
        car1.vitezaMaxima = 250;
        car1.stareMasina = "rea";
        System.out.println("Numele masinii este: " + car1.numeleMasinii);

        Car car2 = new Car("Mercedes", 300, "buna");

        System.out.println(car1.vitezaMaxima);
        System.out.println(car2.vitezaMaxima);
        System.out.println(car2.stareMasina);
        System.out.println(car1.stareMasina);
    }
}
