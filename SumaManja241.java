package VezbanjeKucaNizovi;

import java.util.Scanner;

public class SumaManja241 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sabirati članove niza sve dok je suma manja od 241. 
		
		Scanner s = new Scanner(System.in);
		System.out.println("unesite broj clanova niza");
		int n = s.nextInt();
		
		int niz[] = new int[n];
		
		for(int i=0; i<niz.length;i++) {
			niz[i] = s.nextInt();
		}
		
		int sum = 0;
		int k= 0;
		
		do {
			sum = sum + niz[k];
			k++;
		} while(k<niz.length && sum + niz[k]<241);
		System.out.println(sum);	
		

	}

}
