package domaci_14_1_2022_proizvod_vaga;

public class D_Zadatak2 {

	public static void main(String[] args) {
		
		Proizvod p1 = new Proizvod ("56as7", "banane", 130.0);
		
		Vaga v1 = new Vaga ();
		v1.setMernaJedinica("lb");
		v1.setProizvod(p1);

		v1.print();
	}

}
