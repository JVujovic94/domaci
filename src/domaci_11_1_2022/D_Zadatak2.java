package domaci_11_1_2022;

public class D_Zadatak2 {

	public static void main(String[] args) {
//		Kreirati klasu SmartAirConditioning koja ima:
//			atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//			atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
//			atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
//			atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//			atribut za mod (hladi/greje)
//			metodu za stampu - stampa u formatu 
//			marka - mod - termperatura
//			metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
//			30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
//			metodu koja racuna koliko klima novca potrosi za mesec dana
//			Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//			Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//			Metoda vraca ukupnu cenu za taj mesec
//
//			U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.
		
		SmartAirConditioning sac1 = new SmartAirConditioning ();
		
		sac1.marka = "Samsung";
		sac1.potrosnjaHladjenje = 1;
		sac1.potrosnjaGrejanje = 2;
		sac1.temperatura = 20;
		sac1.mod = "hladi";
		sac1.stampaj();
		System.out.println("Mesecna potrosnja iznosi: " + sac1.mesecnaPotrosnjaKWh() + " kW/h");
		System.out.println("Koriscenje klime na mesecnom nivou kosta: " + sac1.mesecnaPotrosnjaDin() + " din.");
	
	}

}
