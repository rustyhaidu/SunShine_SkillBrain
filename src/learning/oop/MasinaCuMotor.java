package learning.oop;

public class MasinaCuMotor {
    public static void main(String[] args) {
        Motor motor = new Motor("DAS123BD");
        Car car = new Car(motor);

        System.out.println("Nume sasiu:" + car.getMotor().getSerieMotor());

        car.getMotor().setSerieMotor("FAS213DF");
        System.out.println("Nume sasiu:" + car.getMotor().getSerieMotor());
    }
}
