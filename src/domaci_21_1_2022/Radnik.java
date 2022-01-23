package domaci_21_1_2022;

import java.util.ArrayList;

public abstract class Radnik {
//	Kreirati abstraktnu klasu Radnik koja ima:
//	 ime i prezime
//	 niz sektora u kojima radi

	protected String imeIPrezime;
	protected ArrayList <Sektor> sektori = new ArrayList <Sektor>();
	
	public Radnik() {
		super();
	}
	public Radnik(String imeIPrezime) {
		super();
		this.imeIPrezime = imeIPrezime;
		
	}
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	
//	 abstraktnu metodu koja vraca platu radnika
//	 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

	public abstract double plata ();
	
	public abstract void print();

	public void zaposliUSektor (Sektor sektor) {
		this.sektori.add(sektor);
		}
}
