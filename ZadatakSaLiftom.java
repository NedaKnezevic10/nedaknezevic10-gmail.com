package vezbanjeKuca.pocetak;

import java.util.Scanner;

public class ZadatakSaLiftom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*U zgradi se nalazi lift nosivosti 680kg. Napisati program koji proverava
		 *  da li ce lift bezbedno krenuti u zavisnostii od tezine koju treba da
		 *   ponese. Podrazumevane 3 opcije: Lift je preopterecen; Na granici je;
		 *    Lift je pokrenut  (zahtevi zadatka namerno nisu dalje razradjivani 
		 *    jer 1) ostavljam vasoj masti na volju 2) zelim da budem upucena u 
		 *    vas tok razmisljanja).
		 */
		
		System.out.println("Unesite tezinu koju lift treba da ponese");

		Scanner s = new Scanner(System.in);
		double broj = s.nextDouble();

		while (broj < 680 && broj>15) {
			System.out.println("Lift je preopterecen, pokusajte ponovo");
			broj = s.nextDouble();
		}
		if (broj < 680 && broj>15) {
			System.out.println("Lift moze bezbedno da se pokrenue");
		} 
		else if (broj == 680) {
			System.out.println("Lift je na granici preopterecenosti");
		} 
		else if(broj <= 15 && broj >= 0) {
				System.out.println("Lift ne moze da se pokrene jer nema dovoljnu tezinu");
		} 
		else {
			System.out.println("Uneli ste negativnu vrednost");
		}
	}
}
