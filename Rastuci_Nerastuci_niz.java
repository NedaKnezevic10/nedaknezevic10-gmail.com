package DOmaciNizovi;

import java.util.Scanner;

public class Rastuci_Nerastuci_niz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napisati program koji ucitava duzinu niza, niz i proverava da li je niz
		 * rastuci. Primer1 niza: 3 54 123 18 Ispis: Niz nije rastuci. Primer2 niza: 71
		 * 422 1001 5054 Ispis: Niz je rastuci.
		 * 
		 */

		Scanner s = new Scanner(System.in);
		int i;

		System.out.println("Unesite broj clanova niza");
		int n = s.nextInt();

		int[] niz = new int[n];

		for (i = 0; i < niz.length; i++) {
			System.out.println("Ucitajte clanove niza ");
			niz[i] = s.nextInt();
		}

		for (i = 0; i < niz.length-1; i++) {
			if (niz[i + 1] <niz[i]) {          //

				break;
			}
		
		}
	System.out.println("niz je rastuci");
}
}
