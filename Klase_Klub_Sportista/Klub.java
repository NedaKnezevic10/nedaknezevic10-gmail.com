package Klase_Klub_Sportista;

public class Klub {
	/*Klub poseduje naziv, sediste (grad), godinu osnivanja i niz sportista tipa Sportista.
	 *  Sva polja mogu da se dohvate,
	 *  a naziv kluba moze i da se postavi.
Napisati metodu koja ce ispisati ceo objekat klase klub.
*/
	
	private String naziv;
	private String grad;
	private int godOsnivanja;
	private Sportista [] nizSportista = new Sportista[3];
	
	
	public Klub (String naziv, String grad, int godOsnivanja, Sportista [] nizSportista) {
		this.naziv = naziv;
		this.grad = grad;
		this.godOsnivanja = godOsnivanja;
		this.nizSportista=nizSportista;
	}
	
	
	public void ispisiSportiste() {
		System.out.println(nizSportista[0].ispis() + nizSportista[1].ispis() + nizSportista[2]);
	}
	
	
	
	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String n) {
		naziv = n;
	}
	
	public String getGrad() {
		return grad;
	}
	
	public int getGodOsnivanja() {
		return godOsnivanja;
	}
	public String toString() {
		String ispis=naziv+" "+grad+" "+godOsnivanja+" Igraci: ";
		for(int i=0;i<nizSportista.length-1;i++) {
			ispis+=nizSportista[i]+", ";
		}
		ispis+=nizSportista[nizSportista.length-1]+".";
		return ispis;
	}
	
	

}
