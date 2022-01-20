package domaci_17_1_2022_zeleni_karton;

import java.util.ArrayList;

public class zadatak1 {

	public static void main(String[] args) {
		//
//		U glavnoj klasi:
//	kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//	(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//	(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita
		
		ArrayList <ZeleniKarton> zk = new ArrayList <ZeleniKarton>();
		
		ZeleniKarton i1 = new ZeleniKarton ("Jovana Vujovic", "138/13", "Uporedna socijalna politika", "Ana Cekerevac", 5);
		ZeleniKarton i2 = new ZeleniKarton ("Jovana Vujovic", "138/13", "Medjunarodna socijalna politika", "Ana Cekerevac", 5);
		ZeleniKarton i3 = new ZeleniKarton ("Jovana Vujovic", "138/13", "Politicka ekonomija", "Dragana Mitrovic", 10);
		ZeleniKarton i4 = new ZeleniKarton ("Jovana Vujovic", "138/13", "Sociologija", "Cedomir Cupic", 9);
		ZeleniKarton i5 = new ZeleniKarton ("Jovana Vujovic", "138/13", "Socijalni rad u zajednici", "Miroslav Brkic", 10);
		ZeleniKarton i6 = new ZeleniKarton ("Jovana Vujovic", "138/13", "Sociologija porodice", "Milos Besic", 9);
		ZeleniKarton i7 = new ZeleniKarton ("Jovana Vujovic", "138/13", "Mentalna higijena", "Jasna Hrncic", 10);
		ZeleniKarton i8 = new ZeleniKarton ("Jovana Vujovic", "138/13", "Socijalni rad sa migrantima", "Natalija Perisic", 8);
		ZeleniKarton i9 = new ZeleniKarton ("Jovana Vujovic", "138/13", "Istorija politickih teorija", "Vladimir Pavicevic", 8);
		ZeleniKarton i10 = new ZeleniKarton ("Jovana Vujovic", "138/13", "Doktrine socijalne politike", "Mira Lakicevic", 5);
		
		zk.add(i1);
		zk.add(i2);
		zk.add(i3);
		zk.add(i4);
		zk.add(i5);
		zk.add(i6);
		zk.add(i7);
		zk.add(i8);
		zk.add(i9);
		zk.add(i10);
		
		for (int i = 0; i < zk.size(); i++) {
			zk.get(i).print();
			System.out.println();
		}
		
		double prosecnaOcena = 0;
		double ukupno = 0;
		for (int i = 0; i < zk.size(); i++) {
			ukupno = ukupno + zk.get(i).getOcena();
			prosecnaOcena = ukupno / zk.size();
		}
		
		System.out.println("Prosecna ocena svih ispita je: " + prosecnaOcena);
		System.out.println();
	
	
		double sum = 0;
		double prosekPolozenih = 0;
		double brojac = 0;
		for (int i = 0; i < zk.size(); i++) {
			if (zk.get(i).jePolozen()) {
				sum = sum + zk.get(i).getOcena();
				brojac = brojac + 1;
		}
		}
		prosekPolozenih = sum / brojac;
		System.out.println("Prosecna ocena polozenih ispita je: " + prosekPolozenih);
		}

}
