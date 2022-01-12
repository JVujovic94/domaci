package domaci_11_1_2022;

import domaci_10_1_2022.Proizvod;

public class D_Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//		 i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. 
//		Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//		vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, 
//		a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. 
//		Smatrati da je parametar popust u opsegu od 0 do 100.
//		racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. 
//		Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:	
//		za tezinu do 100g, postarina iznosi 200din
//		za tezinu od 101g do 500g, postarina iznosi 400din
//		za tezinu preko 500g, postarina iznosi 1000din
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.
		
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
