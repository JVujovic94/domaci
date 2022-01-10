package domaci_10_1_2022;

import p10_1_2022_oop.Proizvod;

public class D_Zadatak1 {

	public static void main(String[] args) {

		Proizvod p1 = new Proizvod ();
		
		p1.naziv = "Stolica";
		p1.cena = 2000.00;
		p1.tezina = 2.0;
		p1.stampaj();
		
		System.out.println();
		
		Proizvod p2 = new Proizvod ();
		
		p2.naziv = "Sto";
		p2.cena = 5000.00;
		p2.tezina = 7.0;
		p2.stampaj();
	}

}
