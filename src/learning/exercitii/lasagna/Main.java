package learning.exercitii.lasagna;

public class Main {
    public static void main(String[] args) {
        int a = Lasagna.expectedMinutesInOven();
        int b = Lasagna.preparationTimeInMinutes(65);
        int c = Lasagna.totalTimeInMinutes(54,32);
        int d = Lasagna.remainingMinutesInOven(5);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
