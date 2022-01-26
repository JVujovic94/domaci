package domaci_20_1_2022_kartoni;

import java.util.ArrayList;

public class Igrac extends Osoba {
//	Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		broj (broj koji igrac nosi)
//		poziciju koju igra (odbrambeni, napadac, … )
//		niz kartona
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere za broj, kapiten i poziciju
//		metodu dodaj karton, gde se dodaje karton u niz
//		metodu koja vraca broj zutih kartona
//		metodu koja vraca broj crvenih kartona
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
	
	private int broj;
	private String pozicija;
	private boolean jeKapiten;
	private ArrayList <Karton> kartoni = new ArrayList <Karton> ();
	
	public Igrac() {
		super();
	}
	
	public Igrac(String imeIPrezime, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean jeKapiten) {
		super(imeIPrezime, jmbg, godinaRodjenja);
		this.broj = broj;
		this.pozicija = pozicija;
		this.jeKapiten = jeKapiten;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isJeKapiten() {
		return jeKapiten;
	}

	public void setJeKapiten(boolean jeKapiten) {
		this.jeKapiten = jeKapiten;
	}

//	metodu dodaj karton, gde se dodaje karton u niz
//	metodu koja vraca broj zutih kartona
//	metodu koja vraca broj crvenih kartona
//	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
	
	public void dodajKarton (Karton karton) {
		this.kartoni.add(karton);
	}
	
	public int brojZutih () {
		int countZ = 0;
		for (int i = 0; i < this.kartoni.size(); i++) {
			if (this.kartoni.get(i).getTipKartona().equals("zuti")) {
				countZ++;
		}
		}
		return countZ;

	}
		
	public int brojCrvenih (String karton) {
		int countC = 0;
		for (int i = 0; i < this.kartoni.size(); i++) {
			if (this.kartoni.get(i).getTipKartona().equals("crveni")) {
				countC++;
			}
			}
		return countC;
		}


	public void printIgrac () {
		super.print();
		System.out.println(this.broj + ", " + this.pozicija + ", " + this.jeKapiten);
	}
	
	



}
