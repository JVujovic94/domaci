package domaci_14_1_2022_proizvod_vaga;

public class Proizvod {
//	Kreirati klasu Proizvod koja ima:
//		sifru proizvoda
//		naziv proizvoda
//		cenu po kilogramu (cena po funti se ne cuva, ona se racuna)
//		konstuktor koji prima sva tri parametra (sifra, naziv, cena po kilogramu)
//		gettere i settere za sifru i naziv
//		setter za cenu po kilogramu
//		metodu getCenaKg koja vraca cenu za 1 kg proizvoda
//		metodu getCenaLb koja vraca cenu za 1lb prozvoda
//		 		konverzija: 1 kg = 2.2046 lb
//		metodu koja stampa proizvod u formatu:
//		(sifra) - (naziv)
	
	private String sifra;
	private String naziv;
	private double cenaPoKg;
	
	public Proizvod (String sifra, String naziv, double cenaPoKg) {
		this.sifra = sifra;
		this.naziv = naziv;
		this.cenaPoKg = cenaPoKg;
	}
	
	public void setSifra (String sifra) {
		this.sifra = sifra;
	}
	
	public String getSifra () {
		return this.sifra;
	}

	public void setNaziv (String naziv) {
		this.naziv = naziv;
	}
	
	public String getNaziv () {
		return this.naziv;
	}
	
	public void setCenaPoKg (double cenaPoKg) {
		this.cenaPoKg = cenaPoKg;
	}

	public double getCenaKg () {
		double cenaKg = this.cenaPoKg;
		return cenaKg;
	}
	
	public double getCenaLb () {
		double cenaLb = this.cenaPoKg * 2.2046;
		return cenaLb;
	}
	
	public void print () {
		System.out.println(this.sifra + " - " + this.naziv);
	}

}
