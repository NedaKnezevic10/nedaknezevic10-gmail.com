package Nizovi;

import java.util.Arrays;
import java.util.Scanner;

public class SortiranjeNiza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int[] n = { 10, 0, -10, 2 };

		for (int i = 0; i < n.length; i++) {
			int pozicija = i;
			int min = n[i]; // proglasavam prvi element minimumom

			for (int j = i; j < n.length; j++) {
				if (n[j] < min) {
					pozicija = j;
					min = n[j];
				}

			}

			// zamena pozicija ovog prvom najmanjeg nadjenog

			int temp = n[i];
			n[i] = n[pozicija];
			n[pozicija] = temp;

		}
		// ispisati niz

		System.out.println(Arrays.toString(n));
	}

}
