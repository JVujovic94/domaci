package domaci_20_1_2022osoba;

import java.util.ArrayList;

public class main1 {

	public static void main(String[] args) {
//		(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere. 
//		Podatke za igrace i trenere unosi korisnik sa tastature.
		
		ArrayList <Igrac> igraci = new ArrayList <Igrac>();
		
		Igrac i1 = new Igrac ("J.J", "1234654565", 1990, 4, "n", false);
		Igrac i2 = new Igrac ("J.D", "1565656655", 1991, 5, "o", false);
		Igrac i3 = new Igrac ("J.M", "1867874555", 1992, 9, "n", false);
		
		igraci.add(i1);
		igraci.add(i2);
		igraci.add(i3);
		
		ArrayList <Trener> treneri = new ArrayList <Trener>();
		
		Trener t1 = new Trener ("D.J", "1234654565", 1990, 10, "p");
		Trener t2 = new Trener ("M.D", "1565656655", 1991, 3, "k");
		Trener t3 = new Trener ("A.M", "1867874555", 1992, 2, "k");
		
		treneri.add(t1);
		treneri.add(t2);
		treneri.add(t3);
		
		for (int i = 0; i < igraci.size(); i++) {
			igraci.get(i).printIgrac();
			System.out.println();
		}
		
		System.out.println();


		for (int i = 0; i < treneri.size(); i++) {
			treneri.get(i).printTrener();
			System.out.println();
		}
		
//		Igrac i1 = new Igrac ("Marko Markovic", "11121991703577", 1991, 3, "napadac", true);
//		Igrac i2 = new Igrac ("Stefan Stefanovic", "25031992745091", 1992, 7, "odbrambeni", false);
//		
//		Trener t1 = new Trener ("Milos Milosevic", "01011980705576", 1980, 7, "kondicioni");
//		Trener t2 = new Trener ("Pera Peric", "02021975745014", 1975, 8, "pomocni");
		
//		i1.printIgrac();
//		i2.printIgrac();
//		t1.printTrener();
//		t2.printTrener();
		
		
		
		
	}

}
