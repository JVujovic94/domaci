package domaci_24_1_2022;

import java.util.ArrayList;

public class Korpa {
//	Kreirati klasu Korpa koja ima:
//		niz ambalaza
//		metodu dodaj ambalazu
//		metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//		privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 

	
	private ArrayList <Ambalaza> nizAmbalaza = new ArrayList <Ambalaza> ();
	
	public void dodajAmbalazu (Ambalaza ambalaza) {
		this.nizAmbalaza.add(ambalaza);
	}
	
	public void izbaciAmbalazu (String barkod) {
		for (int i = 0; i < this.nizAmbalaza.size(); i++) {
			if (this.nizAmbalaza.get(i).getBarkod().equals(barkod)) {
				this.nizAmbalaza.remove(i);
			}
		}
	}
	
	private double cenaSaPopustom (double popust) {
		double cenaSaPopustom = 0;
		for (int i = 0; i < nizAmbalaza.size(); i++) {
			cenaSaPopustom = cenaSaPopustom + nizAmbalaza.get(i).cena();
		}
		return cenaSaPopustom - (cenaSaPopustom * (popust / 100));
	}
	
//	metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.
	
		
		public double ukupnaCenaKorpe(SuperKartica superKartica) {
			return cenaSaPopustom(superKartica.getPopust());
		}
		
		public void printKorpa() {
			System.out.println("Korpa: ");
			for (int i = 0; i < nizAmbalaza.size(); i++) {
				nizAmbalaza.get(i).print();
			}
	}
}




