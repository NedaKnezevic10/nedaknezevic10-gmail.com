package DOmaciNizovi;

import java.util.Scanner;

public class Niz_Palindrom {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

	

		System.out.print("Ucitajte broj clanova niza ");
		int n = s.nextInt();

		int niz[] = new int[n];
	
		
		for(int i=0; i<niz.length; i++) {
			System.out.println("unesite elemente niza");
			niz[i] = s.nextInt();
		}
		int i;

		for (i =0; i<niz.length/2; i++) {
			if(niz[i]!=niz[niz.length-1-i])
				break;
			
		}
		if (i==niz.length/2) {
			System.out.println("niz je palindrom");
		}
		else {
			System.out.println("niz nije palindrom");
		}
				
	}
	
	

}
