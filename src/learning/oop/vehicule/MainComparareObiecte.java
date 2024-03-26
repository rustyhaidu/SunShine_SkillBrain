package learning.oop.vehicule;

import learning.oop.vehicule.Car;

public class MainComparareObiecte {
    public static void main(String[] args) {
        Car car1 = new Car("BMV");
        System.out.println(car1);

        Car car2 = new Car();
        System.out.println(car2);

        if (car1.equals(car2)) {
            System.out.println("Sunt aceleasi obiecte");
        } else {
            System.out.println("Nu sunt la fel");
        }
    }
}
