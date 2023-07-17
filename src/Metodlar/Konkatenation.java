package Metodlar;

public class Konkatenation {

    static String a = new String("Das ist ");
    static String b = new String("eine Zeichenkette!");

    static String c = a.concat(b);
    public static void main(String[] args) {


//        String a = new String("Das ist ");
//        String b = new String("eine Zeichenkette!");
//
//        String c = a.concat(b);

        c = a + b;

         a = a.concat(b);

        System.out.println("length(a) = " + length(a));

        System.out.println("equals(a,b) = " + a.equals( b));
    }


    // Stringlänge bestimmen und Strings vergleichen
    public static int length(String a){

        return   a.length();
    }

    public boolean equals( String a, String b){

        return a.equals(b);

    }

}
