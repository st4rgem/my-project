package Fahrkartenautomat;

import java.util.Scanner;

class Fahrkartenautomat {
	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);
        int anzahlTickets;
		double TicketPreis;
		double eingezahlterGesamtbetrag;
		double eingeworfeneMuenze;
		double rueckgabebetrag;
		double nochZuZahlen;

		// 1
		System.out.print("TicketPreis (Euro): ");
		TicketPreis = tastatur.nextDouble();

        System.out.print("Anzahl der Tickets: ");
anzahlTickets = tastatur.nextInt();
TicketPreis = TicketPreis * anzahlTickets;

		// 2
		eingezahlterGesamtbetrag = 0.0;
		nochZuZahlen = 0.0;
		while (eingezahlterGesamtbetrag < TicketPreis) {
			nochZuZahlen = TicketPreis - eingezahlterGesamtbetrag;
			System.out.printf("Noch zu zahlen: %.2f Euro\n", + nochZuZahlen);
			System.out.print("Eingabe (mind. 5 Cent, höchstens 2 Euro): ");
			eingeworfeneMuenze = tastatur.nextDouble();
			eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
		}
		
		// 3
		System.out.println("\nFahrschein wird ausgegeben");
		for (int i = 0; i < 8; i++) {
			System.out.print("=");
			try {
				Thread.sleep(200);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n\n");
		
		// 4
		rueckgabebetrag = eingezahlterGesamtbetrag - TicketPreis;
		if (rueckgabebetrag > 0.0) {
			System.out.printf("Der Rückgabebetrag in Höhe von %.2f Euro\n", + rueckgabebetrag);
			System.out.println("wird in folgenden Münzen ausgezahlt:");

			while (rueckgabebetrag >= 2.0) { // 2-Euro-Münzen
				System.out.println("2 Euro");
                 rueckgabebetrag= Math.round(rueckgabebetrag * 100.0) / 100.0;
				rueckgabebetrag = rueckgabebetrag - 2.0;
			}
			while (rueckgabebetrag >= 1.0) { // 1-Euro-Münzen
				System.out.println("1 Euro");
                 rueckgabebetrag= Math.round(rueckgabebetrag * 100.0) / 100.0;
				rueckgabebetrag = rueckgabebetrag - 1.0;
			}
			while (rueckgabebetrag >= 0.5) { // 50-Cent-Münzen
				System.out.println("50 Cent");
                 rueckgabebetrag= Math.round(rueckgabebetrag * 100.0) / 100.0;
				rueckgabebetrag = rueckgabebetrag - 0.5;
			}
			while (rueckgabebetrag >= 0.2) { // 20-Cent-Münzen
				System.out.println("20 Cent");
                 rueckgabebetrag= Math.round(rueckgabebetrag * 100.0) / 100.0;
				rueckgabebetrag = rueckgabebetrag - 0.2;
			}
			while (rueckgabebetrag >= 0.1) { // 10-Cent-Münzen
				System.out.println("10 Cent");
                 rueckgabebetrag= Math.round(rueckgabebetrag * 100.0) / 100.0;
				rueckgabebetrag = rueckgabebetrag - 0.1;
			}
			while (rueckgabebetrag >= 0.05) { // 5-Cent-Münzen
				System.out.println("5 Cent");
                rueckgabebetrag= Math.round(rueckgabebetrag * 100.0) / 100.0; // Rundung auf 2 Nachkommastellen
				rueckgabebetrag = rueckgabebetrag - 0.05;
			}
		}

		System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
				+ "Wir wünschen Ihnen eine gute Fahrt.");

		tastatur.close();
	}
}