package learning.stringuri;

public class StringComparison {

    public static void main(String[] args) {
        String h = "hello";
        String h2 = new String("hello");
        String h3 = "hello";

        if(h == h2){
            System.out.println("Hey");
        }else {
            System.out.println("Yo");
        }

        // comparam cu equals obiectele
        if(h.equals(h2)){
            System.out.println("Hey");
        }else {
            System.out.println("Yo");
        }
    }
}
