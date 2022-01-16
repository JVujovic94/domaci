package domaci_14_1_2022;

public class Knjiga {
	
//	Kreirati klasu Knjiga koji ima:
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
	
	
	
	private String isbn;
	private String naziv;
	private int godina;
	private Autor autor;
	
	public Knjiga () {
		
	}
	
	public Knjiga (String isbn, String naziv, int godina) {
		this.isbn = isbn;
		this.naziv = naziv;
		this.godina = godina;
	}
	
	public void setIsbn (String isbn) {
		this.isbn = isbn;
	}
	
	public String getIsbn () {
		return this.isbn;
	}
	
	public void setNaziv (String naziv) {
		this.naziv = naziv;
	}
	
	public String getNaziv () {
		return this.naziv;
	}
	
	public void setGodina (int godina) {
		this.godina = godina;
	}
	
	public int getGodina () {
		return this.godina;
	}
	
	public void setAutor (Autor autor) {
		this.autor = autor;
	}

	private Autor getAutor () {
		return this.autor;
	}
	
	public void print () {
		System.out.println(this.isbn);
		System.out.println(this.naziv + " - " + this.godina);
		System.out.print("Autor: ");
		this.autor.print();
}
}