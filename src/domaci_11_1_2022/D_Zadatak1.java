package domaci_11_1_2022;

import domaci_10_1_2022.Proizvod;

public class D_Zadatak1 {

	public static void main(String[] args) {
		
		Product pr1 = new Product ();
		
		pr1.naziv = "Knjiga";
		pr1.cena = 300.0;
		pr1.tezina = 100.0;
		pr1.povecajCenu(30);
		pr1.stampaj();
		System.out.println();
		System.out.println("Cena sa popustom je: " + pr1.vratiCenuSaPopustom(10) + " din.");
		System.out.println("Cena postarine je: " + pr1.racunajPostarinu() + " din.");
		System.out.println();
		
		Product pr2 = new Product ();
		
		pr2.naziv = "Igracka";
		pr2.cena = 700.0;
		pr2.tezina = 600.0;
		pr2.povecajCenu(50);
		pr2.stampaj();
		System.out.println();
		System.out.println("Cena sa popustom je: " + pr2.vratiCenuSaPopustom(20) + " din.");
		System.out.println("Cena postarine je: " + pr2.racunajPostarinu() + " din.");
	}
}

