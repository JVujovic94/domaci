package domaci_20_1_2022osoba;

public class main1 {

	public static void main(String[] args) {
		Igrac i1 = new Igrac ("Marko Markovic", "11121991703577", 1991, 3, "napadac", true);
		Igrac i2 = new Igrac ("Stefan Stefanovic", "25031992745091", 1992, 7, "odbrambeni", false);
		
		Trener t1 = new Trener ("Milos Milosevic", "01011980705576", 1980, 7, "kondicioni");
		Trener t2 = new Trener ("Pera Peric", "02021975745014", 1975, 8, "pomocni");
		
		i1.printIgrac();
		i2.printIgrac();
		t1.printTrener();
		t2.printTrener();
		
		
		
		
	}

}
