package domaci_17_1_2022_transakcija;

public class zadatak2 {

	public static void main(String[] args) {
		Racun posiljalac = new Racun ("100-2325-100", "Jovana Vujovic", 50000);
		Racun primalac = new Racun ("200-75785-446", "Ksenija Vujovic", 20000);
		Transakcija t1 = new Transakcija ("a121b", posiljalac, primalac);
		
		posiljalac.print();
		System.out.println();
		primalac.print();
		System.out.println();
		
		t1.izvrsiTransakciju(5000);
		t1.print();
		System.out.println();
		
		posiljalac.print();
		System.out.println();
		primalac.print();
	}

}
