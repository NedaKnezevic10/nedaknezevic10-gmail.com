package VezbanjeKucaNizovi;

import java.util.Scanner;

public class SusedniCLanoviParni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*Učitati članove niza. Ispisati susjedne članove niza čija je suma parna.*/
		
		Scanner s = new Scanner(System.in);
		System.out.println("unesite broj clanova niza");
		int n = s.nextInt();
		
		int niz[] = new int[n];
		
		
		for(int i=0; i<niz.length; i++) {
			System.out.println("unesite clanove niza");
			niz[i] = s.nextInt();
			
		}
		
		for(int i=0; i<niz.length; i++) {
			if((niz[i] + niz[i+1])%2==0) {
				System.out.println(niz[i] + " " + niz[i+1]);
			}
		}
		

	}

}
