package DOmaciNizovi;

import java.util.Scanner;

public class Niz_Palindrom2 {

	public static int[] ucitajNiz(int brElem) {
		int[] niz = new int[brElem];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}

		return niz;
	}

	public static void proveriPalindrom(int[] niz) {
		int i;
		for (i = 0; i < niz.length / 2; i++) {
			if (niz[i] != niz[niz.length - 1 - i])
				break;

		}
		if (i == niz.length / 2) {
			System.out.println("niz je palindrom");
		} else {
			System.out.println("niz nije palindrom");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("unsi br el niza");
		int n = sc.nextInt();

		int[] niz = ucitajNiz(n);

		proveriPalindrom(niz);

	}

}
