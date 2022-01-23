package domaci_21_1_2022;

public class main1 {

	public static void main(String[] args) {
//		Zadatak  
//		Kreirati klasu Sektor koja ima:
//		 naziv sektora
//		 platu koja je za taj sektor
//
//		Kreirati abstraktnu klasu Radnik koja ima:
//		 ime i prezime
//		 niz sektora u kojima radi
//		 abstraktnu metodu koja vraca platu radnika
//		 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
//
//		Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//		 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
//
//		Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//		 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//		 suma plata svih sektor / broj sektora * 0.5
//		 override uje metodu za platu, tako da se plata racuna po formuli:
//		(prosecna plata za sve sektore u kojima radi) * (broj sektora).
//
//		U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog


		Radnik men1 = new Menadzer ("Jovan Jovanovic");
		
		Radnik mag1 = new Magacioner ("Nikola Nikolic");
		
		Sektor s1 = new Sektor ("Prodaja", 70000);
		Sektor s2 = new Sektor ("Marketing", 70000);
		
		Sektor s3 = new Sektor ("Proizvodnja", 50000);
		Sektor s4 = new Sektor ("Drugo", 30000);
		Sektor s5 = new Sektor ("Transport", 40000);
		
		men1.zaposliUSektor(s1);
		men1.zaposliUSektor(s2);
		mag1.zaposliUSektor(s3);
		mag1.zaposliUSektor(s4);
		mag1.zaposliUSektor(s5);
		
		
		men1.print();
		mag1.print();
	}

}
