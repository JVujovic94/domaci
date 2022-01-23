package domaci_21_1_2022;

import java.util.ArrayList;

public class Magacioner extends Radnik {
//	Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//		 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//		 suma plata svih sektor / broj sektora * 0.5
//		 override uje metodu za platu, tako da se plata racuna po formuli:
	
	private double brojSektora () {
		double count = 0;
		for (int i = 0; i < this.sektori.size(); i++) {
			count = count + 1;
		}
		return count;
	}
	
	private double prosecnaPlataZaSektore () {
		double sum = 0;
		double sum1 = 0;
		for (int i = 0; i < this.sektori.size(); i++) {
			sum = sum + this.sektori.get(i).getPlata();
			sum1 = sum / this.brojSektora() * 0.5;

		}
			return sum1;
	}
	
//	(prosecna plata za sve sektore u kojima radi) * (broj sektora).

	@Override
	public double plata() {
		double plata = this.prosecnaPlataZaSektore() * this.brojSektora();
		return plata;
	}

	public Magacioner() {
		super();
	}

	public Magacioner(String imeIPrezime) {
		super();
		this.imeIPrezime = imeIPrezime;
	}

	@Override
	public void print() {
		System.out.println(this.imeIPrezime + ", " + this.plata());		
	}

	
}
