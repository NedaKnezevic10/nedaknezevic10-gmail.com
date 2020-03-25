package vezbanjeKuca.pocetak;

import java.util.Scanner;

public class Meseci_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napisati program koji na osnovu unetog naziva meseca ispisuje koliko ima
		 * meseci u godini koji pocinju na to slovo(na taj glas) - za resavanje ovog
		 * zadatka koristiti switch
		 */

		System.out.println("Unesite naziv meseca");
		Scanner s = new Scanner(System.in);

		String mesec = s.next();

		switch (mesec) {

		case "februar":
		case "septembar":
		case "oktobar":
		case "novembar":
		case "decembar":
			System.out.println("U godini postoji samo 1 mesec koji pocinje istim slovom kao uneti mesec");
			break;
		case "mart":
		case "april":
		case "maj":
		case "avgust":
			System.out.println("U godini postoje 2 meseca koji pocinju istim slovom");
			break;
		case "januar":
		case "jun":
		case "jul":
			System.out.println("U godini postoje 3 meseca koji pocinju istim slovom");
			break;
		default:
			System.out.println("Molimo vas unesite ime meseca malim slovima");
		}

		s.close();

	}

}
