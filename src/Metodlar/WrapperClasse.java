package Metodlar;

public class WrapperClasse {

    public static void main(String[] args) {

//        Integer i = new Integer(14);
//
//        //oder
//
//        Integer i1 = new Integer("14");
        System.out.println("--------------------------------------------------------");
        System.out.println("parseByte(\"Hallo\"): " + parseByte("Hallo"));
        String result = valueOf("3F", 16);
        System.out.println("Result: " + result);

        System.out.println("--------------------------------------------------------");

        String result1 = valueOf("3F", 16);
        System.out.println("Result: " + result1);

        System.out.println("--------------------------------------------------------");

        System.out.println("--------------------------------------------------------");
        System.out.println("parseInt(\"Hallo\"): " + parseInt("Hallo"));
        String result2 = valueOf("3F", 16);
        System.out.println("Result: " + result2);



    }

    static byte parseByte(String str) {
        try {
            byte parsedByte = Byte.parseByte(str);
            return parsedByte;
        } catch (NumberFormatException e) {
            System.out.println("Hatalı giriş: " + str);
            return 0; // Veya başka bir varsayılan değer döndürebilirsiniz.
        }
    }


    static Integer parseInt(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt;
        } catch (NumberFormatException e) {
            System.out.println("Hatalı giriş: " + str);
            return 0; // Veya başka bir varsayılan değer döndürebilirsiniz.
        }
    }

    static String valueOf(String str, int basis) {   // Ohne Rückgabe Werte
        return Integer.valueOf(str, basis).toString();
    }

    /**
     * Bu örnekte, valueOf metodu, bir sayıyı belirli bir sayı tabanında temsil eden bir String'e dönüştürmek için kullanılır.
     * str parametresi verilen sayıyı ve basis parametresi ise sayı tabanını belirtir.
     * main metodu içinde valueOf metodu çağrılır ve dönüş değeri result değişkenine atanır.
     * Ardından, result değişkeni ekrana yazdırılır.
     * Örneğin, valueOf("3F", 16) çağrısı, "3F" sayısını onaltılık (hexadecimal) tabanda temsil eden bir String'e dönüştürür.
     * Sonuç olarak, "3F" döndürülür ve Result: 3F çıktısı elde edilir.
     * Bu şekilde, valueOf metodu kullanarak sayıları belirli bir tabanda String'e dönüştürebilirsiniz.
     * Örnekte Integer.valueOf() metodu kullanılmıştır, ancak başka veri tipleri ve ilgili sınıflarla da benzer şekilde işlem yapılabilir.
     */

   // System.out.println("--------------------------------------------------------");




}
