package domaci_11_1_2022;

public class D_Zadatak3 {

	public static void main(String[] args) {
//		3..Kreirati klasu FacebookPost koja ima:
//			   Od atributa:
//			ime i prezime korisnika koji je objavio post
//			ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//			tekst objave
//			broj lajkova
//			broj deljenja
//			  Od metoda:
//			like(), koja povecava broj lajkova za 1.
//			dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//			share(), koja povecava broj deljenja za 1
//			print(), koja stampa objavu u formatu:
//			(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//			(tekst objave)
//			Likes (broj lajkova) | Shares (broj deljenja)
//
//			U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//			Primer stampanja:
//			Milan Jovanovic >>> Pera Peric
//			Ovo je tekst objave
//			Likes 3 | Shares 1
		
		FacebookPost fp1 = new FacebookPost ();
		fp1.imePrezimeO = "Jovana Vujovic";
		fp1.imePrezimeP = "Ksenija Vujovic";
		fp1.tekst = "Three years ago. [photo] ♥";
		fp1.brojLajkova = 0;
		fp1.brojDeljenja = 0;
		
		fp1.like();
		fp1.like();
		fp1.like();
		fp1.like();
		fp1.dislike();
		fp1.like();
		fp1.share();
		fp1.print();
		
		System.out.println();
		
		FacebookPost fp2 = new FacebookPost ();
		fp2.imePrezimeO = "Ksenija Vujovic";
		fp2.imePrezimeP = "Jovana Vujovic";
		fp2.tekst = "♥ ♥ ♥ [photo] ♥ ♥ ♥";
		fp2.brojLajkova = 0;
		fp2.brojDeljenja = 0;
		
		fp2.like();
		fp2.like();
		fp2.dislike();
		fp2.like();
		fp2.share();
		fp2.share();
		fp2.print();
		
		System.out.println();
		
		FacebookPost fp3 = new FacebookPost ();
		fp3.imePrezimeO = "Milos Vujovic";
		fp3.imePrezimeP = "Ksenija Vujovic";
		fp3.tekst = "???";
		fp3.brojLajkova = 0;
		fp3.brojDeljenja = 0;
		
		fp3.like();
		fp3.dislike();
		fp3.dislike();
		fp3.dislike();
		fp3.share();
		fp3.print();
	}
}
