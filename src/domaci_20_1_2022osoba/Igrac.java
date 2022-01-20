package domaci_20_1_2022osoba;

public class Igrac extends Osoba {
//	Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		broj (broj koji igrac nosi)
//		poziciju koju igra (odbrambeni, napadac, … )
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere za broj, kapiten i poziciju
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
	
	private int broj;
	private String pozicija;
	private boolean jeKapiten;
	
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
	
	public void printIgrac () {
	super.print();
	System.out.println("broj: " + this.broj);
	System.out.println("pozicija: " + this.pozicija);
//	System.out.println("kapiten: " + this.jeKapiten);
	if (this.isJeKapiten()) {
		System.out.print("igrac je kapiten.");
	} else {
		System.out.println("igrac nije kapiten.");
	}
	System.out.println();
	System.out.println();



}
}