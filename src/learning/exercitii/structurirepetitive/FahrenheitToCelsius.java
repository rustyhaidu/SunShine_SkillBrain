package learning.exercitii.structurirepetitive;

import java.util.Scanner;

/**
 * Convert Fahrenheit to Celsius. Read the temperature from keyboard.
 * 	formula : (F-32) *5/9 =    C;
 *
 */
public class FahrenheitToCelsius {
    /*public static void main(String[] arr) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("introduceti grade fahrenheit: ");
        double gradeFahrenheit=scanner.nextDouble();
        int gradeCelsius=fahrenheitToCelsius(gradeFahrenheit);
        System.out.println("grade celsius: " + gradeCelsius);


    }*/
    public static int fahrenheitToCelsius(double gradeFahrenheit){
        int celsius= (int)((gradeFahrenheit-32) *5/9);
      return celsius ;
    }
}
