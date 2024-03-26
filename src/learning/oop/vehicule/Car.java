package learning.oop.vehicule;

public class Car {
    String numeleMasinii;
    int vitezaMaxima;
    String stareMasina;
    private Motor motor;

    public Car(Motor motor) {
        this.motor = motor;
    }

    public Car(String numeleMasinii) {
        this.numeleMasinii = numeleMasinii;
    }

    public Car(String numeleMasinii, int vitezaMaxima) {
        this(numeleMasinii);
        this.vitezaMaxima = vitezaMaxima;
    }

    public Car(String numeleMasinii, int vitezaMaxima, String stareMasina) {
        this(numeleMasinii,vitezaMaxima);
        this.stareMasina = stareMasina;
    }

    public Car() {

    }

    public Motor getMotor(){
        return this.motor;
    }

    public void setMotor(Motor motor){
        this.motor = motor;
    }
}
