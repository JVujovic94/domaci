package domaci_24_1_2022;

public class StaklenaAmbalaza extends Ambalaza {


//	Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//		kaucija za flasu
//		atribut koji kaze da li se za flasu placa kaucija
//		osnovna cena
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni
//		racuna cenu
//		ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//		ako se ne placa, (osnovna cena) * 1.2
//		metoda stampaj stampa sve podatke iz klase staklena flasa.
	
	private double kaucijaZaFlasu;
	private boolean placanjeKaucije;
	private double osnovnaCena;
	
	

	public StaklenaAmbalaza() {
		super();
	}

	public StaklenaAmbalaza(String barkod, String naziv, double netoTezina, double brutoTezina, double kaucijaZaFlasu, boolean placanjeKaucije, double osnovnaCena) {
		super(barkod, naziv, netoTezina, brutoTezina);
		this.kaucijaZaFlasu = kaucijaZaFlasu;
		this.placanjeKaucije = placanjeKaucije;
		this.osnovnaCena = osnovnaCena;
	}

	public double getKaucijaZaFlasu() {
		return kaucijaZaFlasu;
	}

	public void setKaucijaZaFlasu(double kaucijaZaFlasu) {
		this.kaucijaZaFlasu = kaucijaZaFlasu;
	}

	public boolean isPlacanjeKaucije() {
		return placanjeKaucije;
	}

	public void setPlacanjeKaucije(boolean placanjeKaucije) {
		this.placanjeKaucije = placanjeKaucije;
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
		if (this.placanjeKaucije) {
			cena = this.osnovnaCena * 1.2 + this.kaucijaZaFlasu;
		} else {
			cena = this.osnovnaCena * 1.2;
		}
		return cena;
	}

	@Override
	public void print() {
		System.out.println(this.barkod + " - " + this.naziv);
		System.out.println("Osnovna cena: " + this.osnovnaCena);
		System.out.println("Ukupna cena: " + this.cena());
		if (this.placanjeKaucije) {
			System.out.println("Kaucija se placa."); 
		} else {
			System.out.println("Kaucija se ne placa.");
		}
		System.out.println();
		
	}
	
//	racuna cenu
//	ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//	ako se ne placa, (osnovna cena) * 1.2
//	metoda stampaj stampa sve podatke iz klase staklena flasa.

}
