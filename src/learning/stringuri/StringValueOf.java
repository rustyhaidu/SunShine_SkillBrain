package learning.stringuri;

public class StringValueOf {
    public static void main(String[] args) {
        int nr = 10;
        //String nrString = nr+"";
        String nrString = String.valueOf(nr);
        System.out.println("Numarul intreg convertit la String: " + nrString);

        double nrDouble = 10.5;
        String nrDoubleString = String.valueOf(nrDouble);
        System.out.println("Numarul double convertit la String: " + nrDoubleString);

        boolean booleanValue = true;
        String booleanValueString = String.valueOf(booleanValue);
        System.out.println("Numarul boolean convertit la String: " + booleanValueString);
    }
}
