package domaci_21_1_2022;

import java.util.ArrayList;

public class Menadzer extends Radnik {
//	Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//		 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.

	
	@Override
	public double plata() {
		double sum = 0;
		for (int i = 0; i < this.sektori.size(); i++) {
			sum = sum + this.sektori.get(i).getPlata();
		}
		return sum;
	}

	public Menadzer() {
		super();
	}

	public Menadzer(String imeIPrezime) {
		super();
		this.imeIPrezime = imeIPrezime;
	}

	@Override
	public void print() {
		System.out.println(this.imeIPrezime + ", " + this.plata());
	}
	
	
	
}
