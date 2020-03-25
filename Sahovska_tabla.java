package DOmaciNizovi;

import java.util.Scanner;

public class Sahovska_tabla {

	public static int[] ucitajPoziciju() {
		Scanner sc = new Scanner(System.in);
		int[] niz = new int[2];

		System.out.println("unesi red");
		niz[0] = sc.nextInt();

		System.out.println("unesi kolonu");
		niz[1] = sc.nextInt();

		return niz;
	}

	public static void proveriNapad(int[] nizPion, int[] nizSkakac) {

		int redPiona = nizPion[0];
		int kolonaPiona = nizPion[1];
		int redSkakaca = nizSkakac[0];
		int kolonaSkakaca = nizSkakac[1];

		if ((redPiona > 8 || redPiona < 1) || (redSkakaca > 8 || redSkakaca < 1) || (kolonaPiona > 8 || kolonaPiona < 1)
				|| (redSkakaca > 8 || redSkakaca < 1)) {
			System.out.println("greska u unosu");
		} else {
			if ((redSkakaca == redPiona - 1) && (kolonaSkakaca == kolonaPiona - 1)) {
				System.out.println("Skakac je napadnut");
			}
			if ((redSkakaca == redPiona - 1) && (kolonaSkakaca == kolonaPiona + 1)) {
				System.out.println("Skakac je napadnut");
			}
		}

	}

	public static void main(String[] args) {

		System.out.println("unesi poziciju piona");

		int[] nizPiona = ucitajPoziciju();

		System.out.println("unesi poziciju skakaca");

		int[] nizSkakaca = ucitajPoziciju();

		proveriNapad(nizPiona, nizSkakaca);

	}

}
