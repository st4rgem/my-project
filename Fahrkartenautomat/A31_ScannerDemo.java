package Fahrkartenautomat;
import java.util.Scanner; 
public class A31_ScannerDemo {
   public static void main(String[] args) {
        int ganzzahl;
        double kommazahl;
        String wort;
        boolean wahrheitswert;
        char buchstabe;
        
        Scanner tastatur = new Scanner(System.in); // Erzeugen eines Objekts der Klasse Scanner
        
        System.out.print("Bitte geben Sie eine ganze Zahl ein: ");
        //TODO
        ganzzahl = tastatur.nextInt();
        System.out.println("Sie haben " + ganzzahl + " eingegeben!");
        System.out.println();
        
        System.out.print("Bitte geben Sie eine Zahl mit Nachkommastellen ein: ");
        //TODO
        kommazahl = tastatur.nextDouble();
        System.out.println("Sie haben " + kommazahl + " eingegeben!");
        System.out.println();
        
        System.out.print("Bitte geben Sie ein Wort ein: ");
        //TODO
        wort = tastatur.next();
        System.out.println("Sie haben '" + wort + "' eingegeben!");

        System.out.println();
        
        System.out.print("Bitte geben Sie einen Wahrheitswert ein (true / false): ");
        //TODO
        wahrheitswert = tastatur.nextBoolean();
        System.out.println("Sie haben '" + wahrheitswert + "' eingegeben!");
        System.out.println();
        
        System.out.print("Bitte geben Sie einen einzelnen Buchstaben ein: ");
        //TODO
        buchstabe = tastatur.next().charAt(0);
        System.out.println("Sie haben '" + buchstabe + "' eingegeben!");
        tastatur.close();
    }
} 

