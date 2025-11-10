package Fahrkartenautomat.src;

public class A11_Uebung {
    public static void main(String[] args) {
        // Variablen
        // Übung 1
        int cent;
        cent = 70;
        cent = 80;
        System.out.println("Cent: " + cent);
        double maximum = 95.50;
        System.out.println("Maximum: " + maximum);

        // Übung 2
        boolean status = true;
        short minusTausend = -1000;
        short langnummer = 1255; 
        char hash = '#';
        byte acht = 8;
        long grosseZahl = 2147483648L;

        System.out.println(status);
        System.out.println(minusTausend);
        System.out.println(langnummer);
        System.out.println(hash);
        System.out.println(acht);
        System.out.println(grosseZahl);

        // Übung 3
        String satz1 = "Java macht Spass";
        final int CHECK_NR = 8765;

        System.out.println(satz1);
        System.out.println(CHECK_NR);

        /*
         * Übung 4
         * Ich finde Datentypen sinnvoll, weil sie helfen, Speicher zu sparen und Fehler durch falsche Werte zu verhindern
         */

        // Operatoren
        // Übung 1.1:
        int ergebnis = 4 + 8 * 9 - 1;
        System.out.println(ergebnis); // 4 + 72 - 1 = 75
        // Übung 1.2:
        int zaehler = 1;
        zaehler++;
        System.out.println(zaehler);
        // Übung 1.3:
        int div = 22 / 6;
        System.out.println(div);
        // Übung 1.4:
        int a = 2;
        int b = 5 + a++; // a++ erhöht a erst nach der Berechnung, b = 7, a = 3
        int c = 5 + ++a; // ++a erhöht a vor der Berechnung, c = 9, a = 4

        System.out.println("a++ Beispiel: b = " + b + ", a = " + a);
        System.out.println("++a Beispiel: c = " + c + ", a = " + a);

        // Übung 2
        /*
         * && Operator:
         * false&&false>> true
         * false&&true>> false
         * true&&false>> false
         * true&&true>> true
         * 
         * || Operator:
         * false||false>> false
         * false||true>> true
         * true||false>> true
         * true||true>> true
         * 
         */

        // Übung 3

        int schalter = 10;

        System.out.println(schalter > 7 && schalter < 12); // true
        System.out.println(schalter != 10 || schalter == 12); // false

        // Übung 4
        String satz2 = "Meine Oma " + "fährt im " + "Hühnerstall Motorrad.";
        System.out.println(satz2);
    }
}
