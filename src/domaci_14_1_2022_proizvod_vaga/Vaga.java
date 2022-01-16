package domaci_14_1_2022_proizvod_vaga;

public class Vaga {
//	Kreirati klasu Vaga koja ima:
//		merna jedinica (kg ili lb)
//		proizvod (proizvod koji se meri)
//		default-ni konstuktor
//		getteri i setteri za sve atribute
//		metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije). Na racunanje cene utice i merna jedinica na koju je vaga podesena. 
//		metodu stampaj koja stampa racun u formatu:
//		               (sifra) - (naziv)
//		   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) 
//		   Ukupno: (ukupna cena) 	  
	
	private String mernaJedinica;
	private Proizvod proizvod;
	
	public Vaga () {
		
	}
	
	public void setMernaJedinica (String mernaJedinica) {
		this.mernaJedinica = mernaJedinica;
	}
	
	public String getMernaJedinica () {
		return this.mernaJedinica;
	}
	
	public void setProizvod (Proizvod proizvod) {
		this.proizvod = proizvod;
	}

	public Proizvod getProizvod () {
		return this.proizvod;
	}

//	metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije). Na racunanje cene utice i merna jedinica na koju je vaga podesena. 

	public double sracunajCenu (double tezina) {
		double cena = 0;
		if (this.mernaJedinica.equals("kg")) {
			cena = tezina * this.proizvod.getCenaKg();
		} else if (this.mernaJedinica.equals("lb")) {
			cena = tezina * this.proizvod.getCenaLb();
		}
		return cena;
		}
//	metodu stampaj koja stampa racun u formatu:
//    (sifra) - (naziv)
//(cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) 
//Ukupno: (ukupna cena) 
	
	public void print () {
		this.proizvod.print();
		if (this.mernaJedinica.equals("kg")) {
			System.out.println(this.proizvod.getCenaKg() + this.mernaJedinica + " x " + "1");
			System.out.println("Ukupno: " + this.sracunajCenu(1));
		} else if (this.mernaJedinica.equals("lb")) {
			System.out.println(this.proizvod.getCenaLb() + this.mernaJedinica + " x " + "1");
			System.out.println("Ukupno: " + this.sracunajCenu(1));
		}
		

	}
}
