package domaci_24_1_2022;

public class TetraPak extends Ambalaza {

//	Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//		atribut koji kaze da li se moze reciklirati
//		osnovna cena
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni
	
	private boolean reciklazaMoguca;
	private double osnovnaCena;
	
	

	public TetraPak() {
		super();
	}

	public TetraPak(String barkod, String naziv, double netoTezina, double brutoTezina, boolean reciklazaMoguca, double osnovnaCena) {
		super(barkod, naziv, netoTezina, brutoTezina);
		this.reciklazaMoguca = reciklazaMoguca;
		this.osnovnaCena = osnovnaCena;
	}

	public boolean isReciklazaMoguca() {
		return reciklazaMoguca;
	}

	public void setReciklazaMoguca(boolean reciklazaMoguca) {
		this.reciklazaMoguca = reciklazaMoguca;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cena() {
		double cena = 0;
		if (this.reciklazaMoguca) {
			cena = this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
		} else {
			cena = this.osnovnaCena;
		}
		return cena;
	}

	@Override
	public void print() {
		System.out.println(this.barkod + " - " + this.naziv);
		System.out.println("Osnovna cena: " + this.osnovnaCena);
		System.out.println("Ukupna cena: " + this.cena());
		if (this.reciklazaMoguca) {
			System.out.println("Reciklaza je moguca."); 
		} else {
			System.out.println("Reciklaza nije moguca.");
		}
		System.out.println();

		
	}
	
//	racuna cenu tako da ispunjava uslova:
//	ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//	ako nije u cenu ulazi samo osnovna cena
//	metoda stampaj stampa sve podatke iz klase tetrapak.
	
	


}
