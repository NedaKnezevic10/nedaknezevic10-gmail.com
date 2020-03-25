package Uvezbavanje;

import java.util.Scanner;

public class Suma_Parnih_Proizvod_Neparnih {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva
		 * od 0 do n - za resavanje ovog zadatka koristiti samo jednu petlju (ne jednu
		 * vrstu petlje, vec samo jednu petlju). // podrazumeva se da se n ucitava preko
		 * standardnog ulaza
		 */
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0;
		int sum = 0;
		int prod = 1;
		
		for (i=0; i<=n; i++) {
			if (i%2==0) {
				sum = sum + i;
			}
			else {
				prod = prod *i;
			}
		}
		System.out.println("Zbir parnih brojeva je " + sum);
		System.out.println("Proizvod neparnih brojeva je " + prod);
	}

}
