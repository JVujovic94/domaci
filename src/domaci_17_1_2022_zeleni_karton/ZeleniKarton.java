package domaci_17_1_2022_zeleni_karton;

public class ZeleniKarton {
//	Zadatak
//	Kreirati klasu ZeleniKarton koja ima:
//	ime i prezime studenta 
//	broj indeksa 
//	naziv predmeta
//	ime i prezime profesora
//	ocenu - od 5 do 10
//	gettere i settere
//	konstruktore
	
	private String imeIPrezimeS;
	private String brojIndeksa;
	private String nazivPredmeta;
	private String imeIPrezimeP;
	private int ocena;
	
	public ZeleniKarton() {
	
	}

	public ZeleniKarton(String imeIPrezimeS, String brojIndeksa, String nazivPredmeta, String imeIPrezimeP, int ocena) {
		super();
		this.imeIPrezimeS = imeIPrezimeS;
		this.brojIndeksa = brojIndeksa;
		this.nazivPredmeta = nazivPredmeta;
		this.imeIPrezimeP = imeIPrezimeP;
		this.ocena = ocena;
	}

	public String getImeIPrezimeS() {
		return imeIPrezimeS;
	}

	public void setImeIPrezimeS(String imeIPrezimeS) {
		this.imeIPrezimeS = imeIPrezimeS;
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getImeIPrezimeP() {
		return imeIPrezimeP;
	}

	public void setImeIPrezimeP(String imeIPrezimeP) {
		this.imeIPrezimeP = imeIPrezimeP;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	
//	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//	metodu stampaj koja stampa podatke u formatu:
//			(naziv predmeta) - (ocena)
//			Student: ime i prezime, broj indeksa
//			Profesor: ime i prezime
	
	public boolean jePolozen () {
		boolean polozen = true;
		if (this.ocena > 5) {
			polozen = true;
		} else {
			polozen = false;
		}
		return polozen;
	}
	
	public void print () {
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		System.out.println("Student: " + this.imeIPrezimeS + ", " + this.brojIndeksa);
		System.out.println("Profesor: " + this.imeIPrezimeP);
	}
	
	}





