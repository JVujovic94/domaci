package domaci_11_1_2022;

public class FacebookPost {

	
	
	String imePrezimeO;
	String imePrezimeP;
	String tekst;
	int brojLajkova;
	int brojDeljenja;
	

	





	

	public void like () {
		this.brojLajkova = this.brojLajkova + 1;
	}
	
	public void dislike () {
		this.brojLajkova = this.brojLajkova - 1;
		if (this.brojLajkova < 0) {
			this.brojLajkova = 0;
		}
	}
	
	public void share () {
		this.brojDeljenja = this.brojDeljenja + 1;
	}
	
	public void print () {
		System.out.println(this.imePrezimeO + " >>> " + this.imePrezimeP);
		System.out.println(this.tekst);	
		System.out.println("Likes " + this.brojLajkova + " | " + "Shares " + this.brojDeljenja);
		
	}

}
