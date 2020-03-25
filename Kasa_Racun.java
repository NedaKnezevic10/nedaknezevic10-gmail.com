package WhilePetlja;

import java.util.Scanner;

public class Kasa_Racun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za potrosace sadrzi sledece opcije:
0 - Izlaz iz programa
1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)
2 - naplata racuna
*/
		
		Scanner s = new Scanner(System.in);
		
	
		double cena;
		double racun=0;
		double unetinovac;
		double kusur;
		int opcija;
		
		do {
			System.out.println("0 - Izlaz iz programa\n1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)\n2 - naplata racuna");
			opcija = s.nextInt();
			switch(opcija) {
			case 0: 
				System.out.println("izlaz iz programa");
				break;
		
			case 1:
				System.out.println("Unesite cenu proizvoda");
				cena = s.nextDouble();
				racun = racun + cena;
				break;
			case 2:
				System.out.println("Vas racun je " + racun);
				System.out.println("unesite kolicinu novca za naplatu racuna");
				unetinovac = s.nextDouble();
				if (unetinovac<racun) {
					System.out.println("Greska, uneli ste manje novca");
	
				}
				else {
					kusur = unetinovac-racun;
					System.out.println("Hvala, vas kusur je " + kusur);
					racun = 0;	
				}
				break;
			}
				
		
		} while(opcija!=0); 
	}
}
