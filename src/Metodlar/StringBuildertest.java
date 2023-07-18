package Metodlar;

public class StringBuildertest {

    public static void main(String[] args) {

//        StringBuildertest a = new StringBuildertest();
//        StringBuildertest b = new StringBuildertest();

        var puffer = new StringBuilder( );
        System.out.println("Puffergröße:  " + puffer.capacity());

        System.out.println("Lange des Pufferinhalts:  " + puffer.length());

        System.out.println("puffer: " + puffer);

        puffer.append("Drei Chinesen ");

        System.out.println("Puffergröße:  " + puffer.capacity());

        System.out.println("Lange des Pufferinhalts:  " + puffer.length());

        System.out.println("puffer: " + puffer);

        puffer.setCharAt(2,'i');

        puffer.setCharAt(9,'i');

        puffer.setCharAt(11,'i');

        System.out.println("puffer: " + puffer);

        System.out.println("Lange des Pufferinhalts:  " + puffer.length());

        System.out.println("puffer: " + puffer);

        System.out.println("Puffergröße:  " + puffer.capacity());

        puffer.append("Drei Chinesen ");

        puffer.append(" mit dem Kontrabass ");

        System.out.println("puffer: " + puffer);

        System.out.println("Puffergröße:  " + puffer.capacity());

        System.out.println("Lange des Pufferinhalts:  " + puffer.length());

        puffer.insert(47,'!');

        System.out.println("puffer = " + puffer);

    }
}
