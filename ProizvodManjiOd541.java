package VezbanjeKucaNizovi;

import java.util.Scanner;

public class ProizvodManjiOd541 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		 Učitati članove niza. Množiti članove niza sve dok je proizvod manji od 541
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("unesite broj clanova niza");
		int n = s.nextInt();
		
		int niz[] = new int [n];
		
		for(int i=0; i<niz.length; i++) {
			System.out.println("unesite clan niza");
			niz[i] = s.nextInt();
		}
		int prod = 1;
		int i = 0;
		
		/*while(i<niz.length && prod<541) {
			prod = prod * niz[i];
			i++;
			
		}
		System.out.println(prod/niz[i-1]);*/
		
		do {
			prod = prod * niz[i];
			i++;
		} while(i<niz.length && prod * niz[i]<541);
		
		System.out.println(prod);
	}
}
