package domaci_13_1_2022;

public class FacebookPost {

	private String imePrezimeO;
	private String imePrezimeP;
	private String tekst;
	private int brojLajkova;
	private int brojDeljenja;
	
	public FacebookPost () {
		
	}
	
	public FacebookPost (String imePrezimeO, String imePrezimeP, String tekst) {
		this.imePrezimeO = imePrezimeO;
		this.imePrezimeP = imePrezimeP;
		this.tekst = tekst;
	}
	
	public FacebookPost (String imePrezimeO2, String imePrezimeP2, String tekst2) {
		this.imePrezimeO = imePrezimeO2;
		this.imePrezimeP = imePrezimeP2;
		this.tekst = tekst2;
	}
	
//	public int getBrojLajkova () {
//		return this.brojDeljenja;
//	
//	}
//	public int getBrojDeljenja () {
//		return this.brojDeljenja;
//	}
	

	
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

