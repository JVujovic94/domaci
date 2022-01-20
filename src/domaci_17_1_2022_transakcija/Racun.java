package domaci_17_1_2022_transakcija;

public class Racun {
//	Kreirati klasu Racun koja ima:
//		broj racuna (npr: 170-289328923-23)
//		ime i prezime osobe
//		trenutno stanje na racunu (npr: 100, 1220)
//		gettere i setter za sve atribute, sem settera za stanje na racunu

	
	private String broj;
	private String imeIPrezime;
	private double trenutnoStanje;
	
	public Racun () {
		
	}
	
	public Racun(String broj, String imeIPrezime, double trenutnoStanje) {
		super();
		this.broj = broj;
		this.imeIPrezime = imeIPrezime;
		this.trenutnoStanje = trenutnoStanje;
	}

	public String getBroj() {
		return broj;
	}

	public void setBroj(String broj) {
		this.broj = broj;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public double getTrenutnoStanje() {
		return trenutnoStanje;
	}
	
//	metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
//	metodu koja stampa podatke o racunu u formatu:
//	Ime i prezime  -  broj racuna
//	stanje na racunu je (trenutno stanje) rsd.
	
	
	public  void promenaStanja (double iznos) {
		this.trenutnoStanje = trenutnoStanje + iznos;
		if (this.trenutnoStanje < 0) {
			this.trenutnoStanje = 0;
		}
	}
	
	public void print () {
		System.out.println(this.imeIPrezime + " - " + this.broj);
		System.out.println("stanje na racunu je: " + this.trenutnoStanje + ".rsd");
	}

}
