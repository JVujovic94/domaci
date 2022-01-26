package domaci_20_1_2022_kartoni;

public class Osoba {
//	Kreirati klasu Osoba koja ima:
//		ime i prezime
//		jmbg
//		godinu rodjenja
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere 
//		metodu stampaj koja stampa u formatu:
//		(ime i prezime), (jmbg), (godina rodjenja)
	
	protected String imeIPrezime;
	protected String jmbg;
	protected int godinaRodjenja;
	
	public Osoba() {
		super();
	}

	public Osoba(String imeIPrezime, String jmbg, int godinaRodjenja) {
		super();
		this.imeIPrezime = imeIPrezime;
		this.jmbg = jmbg;
		this.godinaRodjenja = godinaRodjenja;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public int getGodinaRodjenja() {
		return godinaRodjenja;
	}

	public void setGodinaRodjenja(int godinaRodjenja) {
		this.godinaRodjenja = godinaRodjenja;
	}
	
	public void print () {
		System.out.println(this.imeIPrezime + ", " + "jmbg: " + this.jmbg + ", " + "godina rodjenja: " + this.godinaRodjenja);
	}
	
	

}
