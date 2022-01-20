package domaci_18_1_2022;

import java.util.ArrayList;

public class Student {
//	Napisati klasu Student koja ima
//	broj indeksa
//	ime i prezime
//	tip studija (osnovne, master, doktorske)
//	niz ispita
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za indeks, ime i prezime, tip studija
//	getter za niz predmeta

	
	private int brojIndeksa;
	private String imeIPrezime;
	private String tipStudija;
	private ArrayList <Ispit> ispiti = new ArrayList <Ispit>();
	
	public Student () {
		
	}

	public Student(int brojIndeksa, String imeIPrezime, String tipStudija) {
		super();
		this.brojIndeksa = brojIndeksa;
		this.imeIPrezime = imeIPrezime;
		this.tipStudija = tipStudija;
	}

	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}
	
//	metodu dodaj ispit u niz ispita
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)
	
	public void dodajIspit (Ispit ispit) {
		this.ispiti.add(ispit);
	}
	
	public int prosek () {
		int sum = 0;
		int prosek = 0;
		int brojac = 0;
		for (int i = 0; i < ispiti.size(); i++) {
		if (this.ispiti.get(i).jePolozen()) {
			sum = sum + this.ispiti.get(i).getOcena();
			brojac = brojac + 1;
		}
		prosek = sum / brojac;
		}
		return prosek;
	}
	
	public void print () {
		System.out.println(this.brojIndeksa + " - " + this.imeIPrezime + " - " + this.tipStudija);
		System.out.println("Predmeti: ");
		for (int i = 0; i < ispiti.size(); i++) {
			System.out.println(this.ispiti.get(i).getNazivPredmeta() + " - " + this.ispiti.get(i).getImeIPrezimeProfesora() + " - " + this.ispiti.get(i).getOcena());
		}
		System.out.println("Prosecna ocena: " + this.prosek());
	}
	}


	
	
	



