package learning.oop.vehicule;

import learning.oop.vehicule.Car;

import java.util.Scanner;

public class MainObiectCreatDeLaTastatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele masinii");
        String numeleMasinii = scanner.nextLine();
        System.out.println("Introduceti viteza maxima");
        int vitezaMaxima = scanner.nextInt();
        Car car = new Car(numeleMasinii, vitezaMaxima);
        System.out.println(car.numeleMasinii);
        System.out.println(car.vitezaMaxima);
    }
}
