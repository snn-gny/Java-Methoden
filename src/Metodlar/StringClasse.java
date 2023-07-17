package Metodlar;

public class StringClasse {

    public static void main(String[] args) {
        String a = new String("Das ist ");
        String b = new String("eine Zeichenkette!");

        // oder:

        a ="Das ist ";
        b = "eine Zeichenkette!";

        String c = a.concat(b);

        System.out.println("c = " + c);

        a =a.concat(b);

        System.out.println("a = " + a);
    }
}
