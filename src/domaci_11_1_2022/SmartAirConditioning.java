package domaci_11_1_2022;

public class SmartAirConditioning {
//	Kreirati klasu SmartAirConditioning koja ima:
//	atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//	atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
//	atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
//	atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//	atribut za mod (hladi/greje)
//	metodu za stampu - stampa u formatu 
//	marka - mod - termperatura
	
	String marka;
	int potrosnjaHladjenje;
	int potrosnjaGrejanje;
	int temperatura;
	String mod;
	
	public void stampa () {
		System.out.println(this.marka + " - " + this.mod + " - " + this.temperatura);
	}
}
