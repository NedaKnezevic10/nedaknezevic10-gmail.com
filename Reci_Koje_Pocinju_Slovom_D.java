package DOmaciNizovi;

import java.util.Scanner;

public class Reci_Koje_Pocinju_Slovom_D {

	public static void main(String[] args) {
		//
		Scanner s = new Scanner(System.in);

		System.out.println("Unestite recenicu");

		String recenica = s.nextLine();

		String[] reci = recenica.split(" ");

		int broj = 0;

		for (int i = 0; i < reci.length; i++) {
			String r = reci[i];
			if (r.charAt(0) == 'd') {
				broj++;
			}
		}

		System.out.println("Ima " + broj + " reci koje se pocinju slovom D");
	}

}
