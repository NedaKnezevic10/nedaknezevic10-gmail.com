package DOmaciNizovi;

import java.util.Scanner;

public class Elementi_niza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Korisnik ucitava niz od n elemenata niza, kao i neki broj br. Program
		 * ispisuje elemente niza deljive brojem br.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Ucitajte broj clanova niza");
		int n = sc.nextInt();

		int niz[] = new int[n];

		
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Ucitaj element niza");
			niz[i] = sc.nextInt();
		}

		System.out.println("Unesite neki broj");
		int br = sc.nextInt();

		System.out.print("Elementi niza deljivi sa zadatim brojem su: ");
		
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % br == 0) {
				System.out.print(niz[i] + " ");
			}
		}

	}
}
