package domaci_20_1_2022_kartoni;

public class main2 {

	public static void main(String[] args) {

		Karton k1 = new Karton ("zuti");
		Karton k2 = new Karton ("crveni");
		Karton k3 = new Karton ("zuti");
		
		
		Igrac i1 = new Igrac ("J.J", "1234654565", 1990, 4, "n", false);
		
		i1.dodajKarton(k1);
		i1.dodajKarton(k2);
		i1.dodajKarton(k3);
	
		i1.brojZutih();
		i1.brojCrvenih();
		i1.printIgrac();
	
	}

}
