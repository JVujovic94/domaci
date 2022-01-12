package domaci_10_1_2022;



public class D_Zadatak2 {

	public static void main(String[] args) {
//		Kreirati klasu SmartAirConditioning koja ima:
//			atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//			atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//			atribut za mod (hladi/greje)
//			metodu za stampu - stampa u formatu 
		
		SmartAirConditioning sac1 = new SmartAirConditioning ();
		
		sac1.marka = "Samsung";
		sac1.temperatura = 18;
		sac1.mod = "hladi";
		sac1.stampaj();
		
		SmartAirConditioning sac2 = new SmartAirConditioning ();
		
		sac2.marka = "Vivax";
		sac2.temperatura = 30;
		sac2.mod = "greje";
		sac2.stampaj();
		
		
		

	}

}
