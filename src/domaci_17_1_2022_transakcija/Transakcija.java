package domaci_17_1_2022_transakcija;

public class Transakcija {
//	Kreirati klasu Transakcija koja ima:
//		id transakcije
//		racun sa kog se prenose sredstva
//		racun na koji se prenose sredstva
//		gettere i settere
//		konstruktore

//
//			Naravno u glavnom kreirati objekte i testirati funkcionalnosti 
	
	private String id;
	private Racun racunPos;
	private Racun racunPrim;
	
	public Transakcija () {
		
	}
	
	public Transakcija(String id, Racun racunPos, Racun racunPrim) {
		super();
		this.id = id;
		this.racunPos = racunPos;
		this.racunPrim = racunPrim;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Racun getRacunPos() {
		return racunPos;
	}

	public void setRacunPos(Racun racunPos) {
		this.racunPos = racunPos;
	}

	public Racun getRacunPrim() {
		return racunPrim;
	}

	public void setRacunPrim(Racun racunPrim) {
		this.racunPrim = racunPrim;
	}
		
//	privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//	ako je prenos sredstava manji od 4500, provizija je fiksna 45
//	ako je prenos sredstava veci od 4500, provizija je 1% 
//	S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji predstavlja visinu transakcije
//	Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
	
	private double provizija (double iznos) {
		double provizija;
		if (iznos < 4500) {
			provizija = 45;
		} else {
			provizija = iznos * 0.1;
		}
		return provizija;
	}
	
//	metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi vrednost koja se prebacuje. 
//	Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).
//	(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava

	public void izvrsiTransakciju (double iznos) {
		if (this.getRacunPos().getTrenutnoStanje() >= iznos) {
			this.getRacunPrim().promenaStanja(iznos - provizija(iznos));
			this.getRacunPos().promenaStanja(-iznos);
		} else {
			System.out.println("Nedovoljno sredstava na racunu.");
		}
	}
		
//		metodu koja stampa podatke o transakciji u formatu:
//		id transkacije
//		Racun sa: Ime i prezime  -  broj racuna
//		Racun na: Ime i prezime  -  broj racuna
	
	public void print () {
		System.out.println(this.id);
		System.out.println("Racun sa: " + this.racunPos.getImeIPrezime() + " - " + this.racunPos.getBroj());
		System.out.println("Racun na: " + this.racunPrim.getImeIPrezime() + " - " + this.racunPrim.getBroj());
	}
	
	}

