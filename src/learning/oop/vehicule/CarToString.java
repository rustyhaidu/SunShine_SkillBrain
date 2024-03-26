package learning.oop.vehicule;

public class CarToString {
    public static void main(String[] args) {
        Car car = new Car("Fiat",240, "medie");
        Motor motor = new Motor("FEA154FD");
        car.setMotor(motor);

        System.out.println(car);
    }
}
