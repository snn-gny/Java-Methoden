package Metodlar;

import javax.swing.*;

public class Stringtest {

    public static void main(String[] args) {

        var vorname = JOptionPane.showInputDialog("Ihr Vorname: ");
        var nachname = JOptionPane.showInputDialog("Ihr Nachname: ");
        var altersangabe =JOptionPane.showInputDialog("Ihr Alter: ");
        var alter = Double.parseDouble(altersangabe);
        var name = vorname+ "  "+nachname;
        System.out.println("Sie heißen  "+name);
        System.out.println("Ihr Vorname bestheht aus " +vorname.length()+" Zeichen");
        System.out.println("Ihr Nachname beginnt mit  "+nachname.charAt(0));
        System.out.println("Ihr Nachname beginnt mit  "+nachname.substring(0,2));

        if (alter >=18 && alter-18>=0){
            System.out.println("Sie sind "+String.valueOf(alter-18) +" Jahren volljährig!");
        }
        else{
            System.out.println("Sie sind "+String.valueOf(Math.abs(alter-18))+" Jahren später volljährig!");

        }


        if (vorname.compareTo(nachname)<0) {
            System.out.println("Ihr Vorname ist lexikalisch vor  "+ "dem Nachnamen einzusortieren!");
        }
        else if(nachname.compareTo(vorname)<0) {
            System.out.println("Ihr Nachname ist lexikalisch vor  " + "dem Vornamen einzusortieren!");
        }
        else if(nachname.compareTo(vorname)==0){
                System.out.println("Ihr Vorname ist identisch "+ " mit dem Nachnamen!");

        }

         else{
            System.out.println("Sie haben falsch geschrieben!");

        }

    }
}
