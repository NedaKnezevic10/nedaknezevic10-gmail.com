package vezbanjeKuca.pocetak;

import java.util.Scanner;

public class TriBrojaMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ucitati tri broja i ispisati njihov maksimum.
		
		Scanner s = new Scanner(System.in);
		double num1 = s.nextDouble();
		double num2 = s.nextDouble();
		double num3 = s.nextDouble();
		double max = num1;
		
		if (num2>max) {
			System.out.println("Maksimum je " + num2);
		}
		
		else if (num3>max) {
			System.out.println("Maksimum je " + num3);
		}
		
		else {
			System.out.println("Maksimum je " + num1);
		}
		s.close();

	}

}
