package domaci_24_1_2022;

public class main {

	public static void main(String[] args) {
	//	U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza 
	//	razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.
		
		Korpa korpa = new Korpa ();
		
		Ambalaza a1 = new StaklenaAmbalaza ("123-456", "Pivo", 200.0, 230.0, 20, true, 50 );
		Ambalaza a2 = new TetraPak ("321-456", "Sok", 500.0, 520.0, true, 80);
		Ambalaza a3 = new StaklenaAmbalaza ("111-456", "Vino", 600.0, 630.0, 20, false, 300 );
		Ambalaza a4 = new TetraPak ("222-456", "Jogurt", 500.0, 520.0, false, 90);
		
		SuperKartica kartica = new SuperKartica (1002, "Jovana Vujovic", 10);
		
		korpa.dodajAmbalazu(a1);
		korpa.dodajAmbalazu(a2);
		korpa.dodajAmbalazu(a3);
		korpa.dodajAmbalazu(a4);
//		korpa.izbaciAmbalazu("321-456");
		
		korpa.ukupnaCenaKorpe(kartica);
		
		korpa.printKorpa();
		System.out.println("Ukupna vrednost korpe je " + korpa.ukupnaCenaKorpe(kartica) + ".rsd");

		kartica.printKartica();
		
	}

}
