package domaci_18_1_2022;

public class Ispit {
//	Napisati klasu Ispit koja ima
//	naziv predmeta
//	ocenu (u rasponu od 5 do 10)
//	Ime i prezime profesora koji predaje predmet
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za sve atribute

	
	private String nazivPredmeta;
	private int ocena;
	private String imeIPrezimeProfesora;
	
	public Ispit() {

	}

	public Ispit(String nazivPredmeta, String imePrezimeProfesora, int ocena) {
		this.nazivPredmeta = nazivPredmeta;
		this.imeIPrezimeProfesora = imePrezimeProfesora;
		this.ocena = ocena;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public String getImeIPrezimeProfesora() {
		return imeIPrezimeProfesora;
	}

	public void setImeIPrezimeProfesora(String imePrezimeProfesora) {
		this.imeIPrezimeProfesora = imePrezimeProfesora;
	}
	
//	metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//	metodu koja stampa ispit u formatu:
//	(naziv predmeta) - (profesor) - (ocena)
	
	public boolean jePolozen () {
		if (this.ocena > 5) {
			return true;
		} else { 
			return false;
		}
	}
		
		public void stampaj() {
			System.out.println(this.nazivPredmeta + " - " + this.imeIPrezimeProfesora + " - " + this.ocena);
	}
	


}
