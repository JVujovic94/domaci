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
	
//	metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
//	30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
	
	public int mesecnaPotrosnja () {
		int mp = 0;
		if (this.mod.equals("hladi")) {
			mp = 30 * 15 * this.potrosnjaHladjenje;
		} else if (this.mod.equals("greje")) {
			mp = 30 * 15 * this.potrosnjaGrejanje;
		}
		return mp;
	}
	
}
