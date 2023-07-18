package Metodlar;

import java.time.Duration;
import java.time.Instant;
public class DateClasse {
    public static void main(String[] args) {

//        Instant start = Instant.now();
//        Instant end = start.plus(Duration.ofMinutes(10));
//        Duration elapsedTime = Duration.between(start, end);
//
//        long elapsedMillis = elapsedTime.toMillis();
//        System.out.println("Geçen süre: " + elapsedMillis + " milisaniye");
//
//        System.out.println("ofDays(25) = " + ofDays(25));

        System.out.println("ofHours(hours) = " + ofHours(10));          // Ciktisi  ofHours(hours) = PT10H        PT= Period of Time


//  Artik yil hesaplamasi methodu
        int year = 2020;
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }


        System.out.println(" yilinin gün sayisi: " + lengthOfYear(2020));


    }


    public static Duration ofDays(int days) {
        return Duration.ofDays(days);
    }

    public static Duration ofHours(int hours) {

        return Duration.ofHours(hours);
    }

    //  Artik yil hesaplamasi methodu
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }


    //
    public static int lengthOfYear(int year) {
        return lengthOfYear(2020);
    }

}