import java.util.Scanner;

class Fahrkartenautomat {
    /**
     * A5.4: Fahrkartenauswahl
     */
    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);
        int ticketWahl;
        int anzahlTickets;
        double ticketPreis = 0.0;
        double eingezahlterGesamtbetrag = 0.0;
        double eingeworfeneMuenze;
        double rueckgabebetrag;
        double nochZuZahlen;

        System.out.println("Wählen Sie ihre Wunschfahrkarte für Berlin AB aus:");
        System.out.println("  Kurzstrecke AB [2,00 EUR] (1)");
        System.out.println("  Einzelfahrschein AB [3,00 EUR] (2)");
        System.out.println("  Tageskarte AB [8,80 EUR] (3)");
        System.out.println("  4-Fahrten-Karte AB [9,40 EUR] (4)");

        // Ticketart auswählen
        do {
            System.out.print("Ihre Wahl: ");
            ticketWahl = tastatur.nextInt();
            switch (ticketWahl) {
                case 1 -> ticketPreis = 2.00;
                case 2 -> ticketPreis = 3.00;
                case 3 -> ticketPreis = 8.80;
                case 4 -> ticketPreis = 9.40;
                default -> System.out.println(">> falsche Eingabe <<");
            }
        } while (ticketWahl < 1 || ticketWahl > 4);

        // Anzahl der Tickets eingeben (1-10)
        do {
            System.out.print("Anzahl der Tickets (1-10): ");
            anzahlTickets = tastatur.nextInt();
            if (anzahlTickets < 1 || anzahlTickets > 10) {
                System.out.println("Ungültige Eingabe! Bitte eine Zahl zwischen 1 und 10 eingeben.\n");
            }
        } while (anzahlTickets < 1 || anzahlTickets > 10);

        ticketPreis *= anzahlTickets;

        // Bezahlvorgang
        while (eingezahlterGesamtbetrag < ticketPreis) {
            nochZuZahlen = ticketPreis - eingezahlterGesamtbetrag;
            System.out.printf("Noch zu zahlen: %.2f €\n", nochZuZahlen);
            System.out.print("Eingabe (mind. 0.05 €, höchstens 2 €): ");
            eingeworfeneMuenze = tastatur.nextDouble();

            boolean gueltig =
                    eingeworfeneMuenze == 0.05 ||
                    eingeworfeneMuenze == 0.10 ||
                    eingeworfeneMuenze == 0.20 ||
                    eingeworfeneMuenze == 0.50 ||
                    eingeworfeneMuenze == 1.00 ||
                    eingeworfeneMuenze == 2.00;
            if (!gueltig) {
                System.out.println("Ungültige Eingabe! Bitte nur gültige Münzen verwenden.\n");
                continue;
            }

            eingezahlterGesamtbetrag += eingeworfeneMuenze;
        }

        // Fahrschein ausgeben
        System.out.println("\nFahrschein wird ausgegeben");
        for (int i = 0; i < 8; i++) {
            System.out.print("=");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n");

        // Rückgabebetrag
        rueckgabebetrag = eingezahlterGesamtbetrag - ticketPreis;
        if (rueckgabebetrag > 0.0) {
            System.out.printf("Der Rückgabebetrag in Höhe von %.2f €\n", rueckgabebetrag);
            System.out.println("wird in folgenden Münzen ausgezahlt:");

            while (rueckgabebetrag >= 2.0) {
                System.out.println("2 €");
                rueckgabebetrag = Math.round((rueckgabebetrag - 2.0) * 100.0) / 100.0;
            }
            while (rueckgabebetrag >= 1.0) {
                System.out.println("1 €");
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

        System.out.println("\nVergessen Sie nicht, den Fahrschein vor Fahrtantritt entwerten zu lassen!");
        System.out.println("Wir wünschen Ihnen eine gute Fahrt.");

        tastatur.close();
    }
}


