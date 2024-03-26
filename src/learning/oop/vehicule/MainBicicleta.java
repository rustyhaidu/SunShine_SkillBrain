package learning.oop.vehicule;

public class MainBicicleta {

    public static void main(String[] args) {
        Bicicleta bicicleta1 = new Bicicleta("MMM");
        bicicleta1.marca = "BMX 12";
        Bicicleta bicicleta2 = new Bicicleta("NNN");
        bicicleta2.marca = "mountain bike";
        Bicicleta bicicleta3 = new Bicicleta("NNN");
        bicicleta2.marca = "pinacle";

        System.out.println(bicicleta1.marca);
        System.out.println(bicicleta2.marca);
        System.out.println(bicicleta3.marca);
    }
}
