package Klase_Klub_Sportista;

public class MainProgram {

	public static void main(String[] args) {
	Sportista s1 = new Sportista("Petar", "Petrovic", 1945);
	System.out.println(s1);
	System.out.println(s1.ispis());
	Sportista s2=new Sportista("Petar", "Petrovic", 1945);
	Sportista[] igraci=new Sportista[2];
	igraci[0]=s1;
	igraci[1]=s2;
	
	
	Klub k = new Klub("Zvezda", "Beograd", 1945, igraci);
	System.out.println(k);
	
	
		

	}

}
