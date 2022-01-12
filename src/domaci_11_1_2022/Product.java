package domaci_11_1_2022;

public class Product {

	String naziv;
	Double cena;
	Double tezina;
	
	public void stampaj () {
		
		System.out.print(this.naziv + ", cena:" + this.cena + " din, tezina:" + this.tezina + " g.");

	}
	
	public void povecajCenu (int vrednostPovecanja) {
		this.cena = this.cena + vrednostPovecanja;
	}
	
	
	public double vratiCenuSaPopustom (int popust) {
		double cenaSaPopustom = this.cena - (this.cena*popust/100);
		return cenaSaPopustom;
	}
	
//	racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. 
//	Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:	
//	za tezinu do 100g, postarina iznosi 200din
//	za tezinu od 101g do 500g, postarina iznosi 400din
//	za tezinu preko 500g, postarina iznosi 1000din
	
	public int racunajPostarinu () {
		int cenaPostarine = 0;
		if (this.tezina <= 100) {
			cenaPostarine = 200;
		} else if (this.tezina >= 101 && this.tezina <= 500) {
			cenaPostarine = 400; 
		} else {
			cenaPostarine = 500;
		}
		return cenaPostarine;
		}
	}
