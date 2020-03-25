package WhilePetlja;

import java.util.Scanner;

public class Zbir_Pozitivnih_Brojeva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Napisati program koji unosi i sabira brojeve
		 *  dokle god nije unesen negativan broj, i ispisuje njihov zbir (zbir pozitivnih brojeva).
        primer: ako korisnik unese 1 2 5 3 -1, 
         program treba da ispise 11*/
		
		Scanner s = new Scanner(System.in);
		int broj = s.nextInt();
		int sum = 0;
		int i =0;
		
		while(broj>0) {
			sum = sum + broj;
			broj = s.nextInt();
			
		}
		System.out.println("Suma je " + sum);
	}
	
}


