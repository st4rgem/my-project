import java.util.Scanner;

class Fahrkartenautomat {
    /*
     * A5.3: Wiederholung der Eingabe der Ticketanzahl
     */
    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);
        int anzahlTickets;
        double TicketPreis;
        double eingezahlterGesamtbetrag;
        double eingeworfeneMuenze;
        double rueckgabebetrag;
        double nochZuZahlen;

        System.out.print("TicketPreis (Euro): ");
        TicketPreis = tastatur.nextDouble();

        // Eingabe der Ticketanzahl mit Validierung
        do {
            System.out.print("Anzahl der Tickets (1-10): ");
            anzahlTickets = tastatur.nextInt();
            if (anzahlTickets < 1 || anzahlTickets > 10) {
                System.out.println("Ungültige Eingabe! Bitte eine Zahl zwischen 1 und 10 eingeben.\n");
            }
        } while (anzahlTickets < 1 || anzahlTickets > 10);

        TicketPreis = TicketPreis * anzahlTickets;

        eingezahlterGesamtbetrag = 0.0;
        nochZuZahlen = 0.0;
        while (eingezahlterGesamtbetrag < TicketPreis) {
            nochZuZahlen = TicketPreis - eingezahlterGesamtbetrag;
            System.out.printf("Noch zu zahlen: %.2f Euro\n", nochZuZahlen);
            System.out.print("Eingabe (0.05, 0.10, 0.20, 0.50, 1, 2, 5, 10, 20): ");
            eingeworfeneMuenze = tastatur.nextDouble();
            boolean gueltig =
                    eingeworfeneMuenze == 0.05 ||
                    eingeworfeneMuenze == 0.10 ||
                    eingeworfeneMuenze == 0.20 ||
                    eingeworfeneMuenze == 0.50 ||
                    eingeworfeneMuenze == 1.00 ||
                    eingeworfeneMuenze == 2.00 ||
                    eingeworfeneMuenze == 5.00 ||
                    eingeworfeneMuenze == 10.00 ||
                    eingeworfeneMuenze == 20.00;
            if (!gueltig) {
                System.out.println("Ungültige Eingabe! Bitte nur gültige Münzen/Scheine verwenden.\n");
                continue;
            }

            eingezahlterGesamtbetrag += eingeworfeneMuenze;
        }

        System.out.println("\nFahrschein wird ausgegeben");
        for (int i = 0; i < 8; i++) {
            System.out.print("=");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n\n");

        rueckgabebetrag = eingezahlterGesamtbetrag - TicketPreis;
        if (rueckgabebetrag > 0.0) {
            System.out.printf("Der Rückgabebetrag in Höhe von %.2f Euro\n", rueckgabebetrag);
            System.out.println("wird in folgenden Münzen ausgezahlt:");

            while (rueckgabebetrag >= 2.0) {
                System.out.println("2 Euro");
                rueckgabebetrag = Math.round((rueckgabebetrag - 2.0) * 100.0) / 100.0;
            }
            while (rueckgabebetrag >= 1.0) {
                System.out.println("1 Euro");
                rueckgabebetrag = Math.round((rueckgabebetrag - 1.0) * 100.0) / 100.0;
            }
            while (rueckgabebetrag >= 0.5) {
                System.out.println("50 Cent");
                rueckgabebetrag = Math.round((rueckgabebetrag - 0.5) * 100.0) / 100.0;
            }
            while (rueckgabebetrag >= 0.2) {
                System.out.println("20 Cent");
                rueckgabebetrag = Math.round((rueckgabebetrag - 0.2) * 100.0) / 100.0;
            }
            while (rueckgabebetrag >= 0.1) {
                System.out.println("10 Cent");
                rueckgabebetrag = Math.round((rueckgabebetrag - 0.1) * 100.0) / 100.0;
            }
            while (rueckgabebetrag >= 0.05) {
                System.out.println("5 Cent");
                rueckgabebetrag = Math.round((rueckgabebetrag - 0.05) * 100.0) / 100.0;
            }
        }

        System.out.println("\nVergessen Sie nicht, den Fahrschein\n" +
                "vor Fahrtantritt entwerten zu lassen!\n" +
                "Wir wünschen Ihnen eine gute Fahrt.");

        tastatur.close();
    }
}