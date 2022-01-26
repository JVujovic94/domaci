package domaci_24_1_2022;

public class SuperKartica {
//	Kreirati klasu SuperKartica koja ima:
//		broj kartice
//		ime i prezime vlasnika
//		popust (200, 500, … )
//		konstuktore (default-ni i sa parametrima)
//		gettere i settere 
//		metodu stampaj koja stampa karticu u formatu:
//		(broj kartice), (ime i prezime)
	
	private int brojKartice;
	private String imeIPrezime;
	private double popust;
	
	public SuperKartica() {
		super();
	}
	
	public SuperKartica(int brojKartice, String imeIPrezime, double popust) {
		super();
		this.brojKartice = brojKartice;
		this.imeIPrezime = imeIPrezime;
		this.popust = popust;
	}
	
	public int getBrojKartice() {
		return brojKartice;
	}
	public void setBrojKartice(int brojKartice) {
		this.brojKartice = brojKartice;
	}
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public double getPopust() {
		return popust;
	}
	public void setPopust(double popust) {
		this.popust = popust;
	}
	
	public void printKartica () {
		System.out.println(this.brojKartice + ", " + this.imeIPrezime);
	}


}
