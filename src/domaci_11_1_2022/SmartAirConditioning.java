package domaci_11_1_2022;

public class SmartAirConditioning {
	
	String marka;
	int potrosnjaHladjenje;
	int potrosnjaGrejanje;
	int temperatura;
	String mod;
	
	public void stampaj () {
		System.out.println(this.marka + " - " + this.mod + " - " + this.temperatura);
	}
	
	public int mesecnaPotrosnjaKWh () {
		int mp = 0;
		if (this.mod.equals("hladi")) {
			mp = 30 * 15 * this.potrosnjaHladjenje;
		} else if (this.mod.equals("greje")) {
			mp = 30 * 15 * this.potrosnjaGrejanje;
		}
		return mp;
	}
	
//	metodu koja racuna koliko klima novca potrosi za mesec dana
//	Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//	Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//	Metoda vraca ukupnu cenu za taj mesec
//
	public int mesecnaPotrosnjaDin () {
		int cena = 0;
		if (this.mesecnaPotrosnjaKWh() <= 350) {
			cena = this.mesecnaPotrosnjaKWh() * 6;
		} else {
			cena = this.mesecnaPotrosnjaKWh() * 9;
		}
		return cena;
		}
	}

