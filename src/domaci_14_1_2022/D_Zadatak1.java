package domaci_14_1_2022;

public class D_Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Autor koja ima
//		-ime i prezime
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu:
//		(ime autora) (prezime autora)
//
//		Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
//
//			U glavnom programu napraviti vise autora sa vise knjiga.

	
		Autor a1 = new Autor ("Tana", "French");
		
		Knjiga k1 = new Knjiga ("984-556-26666", "The secret place", 2014);
		k1.setAutor(a1);
		
		k1.print();
		
		System.out.println();
		
		Autor a2 = new Autor ();
		a2.setIme("Amy");
		a2.setPrezime("Tan");
		
		Knjiga k2 = new Knjiga ();
		k2.setIsbn("123-7845-956");
		k2.setNaziv("The Moon Lady");
		k2.setGodina(1989);
		k2.setAutor(a2);
		
		k2.print();
		
		System.out.println();
		
		Autor a3 = new Autor ();
		a3.setIme("Tara");
		a3.setPrezime("French");
		
		Knjiga k3 = new Knjiga ();
		k3.setIsbn("658-7895-99987");
		k3.setNaziv("In The Woods");
		k3.setGodina(2007);
		k3.setAutor(a3);
		
		k3.print();
	
	}
	
	}


