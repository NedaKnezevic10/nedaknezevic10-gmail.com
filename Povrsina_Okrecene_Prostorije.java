package itbootcamp.predavanja;

import java.util.Scanner;

public class Povrsina_Okrecene_Prostorije {
	/* prvi domaci - izracunati povrsinu okrecene prostorije koja nema prozore
	 * konzola ucitava ivice prostorije
	 * UPDATED
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite sirinu sobe: ");
		double b = sc.nextDouble();
		
		System.out.println("Unesite duzinu sobe: ");
		double a = sc.nextDouble();
		
		System.out.println("Unesite visinu sobe: ");
		double c = sc.nextDouble();
		
		while (a<0 || b<0 || c<0) {
			System.out.println("Unelis ste negativnu vrednost, pokusajte ponovo");
			System.out.println("Unesite sirinu sobe: ");
			b = sc.nextDouble();
			System.out.println("Unesite duzinu sobe: ");
			a = sc.nextDouble();
			System.out.println("Unesite visinu sobe: ");
			c = sc.nextDouble();
		}

		double povrsina = (2*a*c + 2*c*b + a*b);
		
		System.out.println("Povrsina okrecene prostorije je: ");
		System.out.println(povrsina + " kvm");
		
		
		
	}

}
