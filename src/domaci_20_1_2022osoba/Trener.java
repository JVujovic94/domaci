package domaci_20_1_2022osoba;

public class Trener extends Osoba {
//	Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//		godine iskustva
//		tip trenera (kondicioni, za igru, pomocni, personalni)
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.

	private int godineIskustva;
	private String tipTrenera;
	
	public Trener() {
		super();
	}
	
	public Trener(String imeIPrezime, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
		super(imeIPrezime, jmbg, godinaRodjenja);
		this.godineIskustva = godineIskustva;
		this.tipTrenera = tipTrenera;
	}
	
	public Trener(int godineIskustva, String tipTrenera) {
		super();
		
	}
	
	public void printTrener () {
		super.print();
		System.out.println("godine iskustva: " + this.godineIskustva);
		System.out.println("tip trenera: " + this.tipTrenera);
		System.out.println();
	}
	
	
	
}
