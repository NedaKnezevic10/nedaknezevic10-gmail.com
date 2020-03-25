package Klase_Klub_Sportista;

public class Sportista {
	/*Sportista poseduje ime, prezime i godinu rodjenja. Ime, prezime i godina rodjenja se zadaju 
	 * prilikom kreiranja i ne mogu da se promene. Sportistu ispisati u obliku: IME_PREZIME: godinaRodjenja*/
	 
	private String ime;
	private String prezime;
	private int godiste;
	
	public Sportista (String ime, String prezime, int godiste) {
		this.ime = ime;
		this.prezime = prezime;
		this.godiste = godiste;
	}
	
	public String ispis() {
		return  ime.toUpperCase() + " " + prezime.toUpperCase() + ": " + godiste;
	}
	
	@Override
	public String toString() {
		return ime + " " + prezime;
	}
	
	
	public String getIme() {
		return ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public int getGodRodjenja() {
		return godiste;
	}
	
	

}
