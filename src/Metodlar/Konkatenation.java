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

        System.out.println("--------------------------------------------------------");

        System.out.println("equals(a,b) = " + a.equals( b));

        System.out.println("--------------------------------------------------------");

        System.out.println("a.compareTo(b) = " + a.compareTo(b));

        System.out.println("--------------------------------------------------------");

        System.out.println("b.charAt(7) = " + b.charAt(9));

        System.out.println("--------------------------------------------------------");

        System.out.println("a.toUpperCase() = " + a.toUpperCase());

        System.out.println("--------------------------------------------------------");

        System.out.println("a.toLowerCase() = " + a.toLowerCase());

        System.out.println("--------------------------------------------------------");

        System.out.println("String.valueOf(i) = " + String.valueOf(33));
        System.out.println("--------------------------------------------------------");

        System.out.println("String.valueOf(99) = " + String.valueOf(9l));
        System.out.println("--------------------------------------------------------");

        System.out.println("String.valueOf(0,12365459 ) = " + String.valueOf(0.12365459874894));

        System.out.println("--------------------------------------------------------");

        System.out.println("String.valueOf(1,23654f) = " + String.valueOf(1.23654f));

        System.out.println("--------------------------------------------------------");
    }


    // Stringlänge bestimmen und Strings vergleichen
    public static int length(String a){

        return   a.length();
    }

    public boolean equals( String a, String b){

        return a.equals(b);

    }


    public int compareTo(String a, String b){

        return  a.compareTo(b);
    }

public  char charAt(int i){

        return b.charAt(7);
}

public String toUpporCase(String a){

        return a.toUpperCase();
}

    public String toLowerCase(String a){

        return a.toLowerCase();
    }

    public static String valueOf(int i ){

     return String.valueOf(i);
    }

    public static String valueOf(long i ){

        return String.valueOf(i);
    }

    public static String valueOf(double i ){

        return String.valueOf(i);
    }

    public static String valueOf(float i ){

        return String.valueOf(i);
    }

}
