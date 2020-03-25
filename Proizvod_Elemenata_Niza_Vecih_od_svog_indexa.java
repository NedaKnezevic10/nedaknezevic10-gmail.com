package DOmaciNizovi;

import java.util.Scanner;

public class Proizvod_Elemenata_Niza_Vecih_od_svog_indexa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Napisati program koji ce na standardnom izlazu
		 *  ispisati proizvod elemenata niza koji su veci od svog indeksa
		 *   (preko konzole uneti duzinu i clanove niza)
		 */
		
		Scanner s = new Scanner(System.in);
		System.out.print("Ucitajte broj clanova niza ");
        int n = s.nextInt();
        int niz[] = new int[n];
        
        System.out.println("Ucitajte clanove niza:");
        
        for (int i = 0; i < n; i++) 
            niz[i] = s.nextInt();
 
        int prod = 1;
        
        for (int i = 0; i < niz.length; i++)
            if (i<niz[i]) {
                prod = prod * niz[i];
        System.out.println("Proizvod je = " + prod);
   

	}
	}

}
