package WhilePetlja;

import java.util.Scanner;

public class Deljivost_od9_do250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napisati program koji ce prebrojati koliko je brojeva od 9 do 250
		 * (ukljucujuci i njih) deljivih brojem 3.
		 */

		Scanner s = new Scanner(System.in);
		int i = 0;
		int broj_deljivih = 0;

		for (i = 9; i <= 250; i++) {
			if (i % 3 == 0) {
				broj_deljivih++;

			}
		}

		System.out.println("broj deljivih je " + broj_deljivih);

	}
}
