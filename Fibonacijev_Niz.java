package WhilePetlja;

import java.util.Scanner;

public class Fibonacijev_Niz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napisati program koji ce ispisati n brojeva Fibonacijevog niza. 
		 */

		Scanner s = new Scanner(System.in);
		int neki_broj = s.nextInt();
		int x = 0;
		int y = 1;
		int z;
		int i;

		for (i = 0; i < neki_broj; i++) {
			z = x + y;
			System.out.println(z);
			x = y;
			y = z;
		}

	}

}
