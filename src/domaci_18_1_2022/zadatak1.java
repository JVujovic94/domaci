package domaci_18_1_2022;

import domaci_17_1_2022_zeleni_karton.ZeleniKarton;

public class zadatak1 {

	public static void main(String[] args) {
		Ispit i1 = new Ispit ("Uporedna socijalna politika", "Ana Cekerevac", 5);
		Ispit i2 = new Ispit ("Medjunarodna socijalna politika", "Ana Cekerevac", 5);
		Ispit i3 = new Ispit ("Politicka ekonomija", "Dragana Mitrovic", 10);
		Ispit i4 = new Ispit ("Sociologija", "Cedomir Cupic", 9);
		Ispit i5 = new Ispit ("Socijalni rad u zajednici", "Miroslav Brkic", 10);
		Ispit i6 = new Ispit ("Sociologija porodice", "Milos Besic", 9);
		Ispit i7 = new Ispit ("Mentalna higijena", "Jasna Hrncic", 10);
		Ispit i8 = new Ispit ("Socijalni rad sa migrantima", "Natalija Perisic", 8);
		Ispit i9 = new Ispit ("Istorija politickih teorija", "Vladimir Pavicevic", 8);
		Ispit i10 = new Ispit ("Doktrine socijalne politike", "Mira Lakicevic", 5);
		
		Student student_1 = new Student(138, "Jovana Vujovic", "osnovne");

		student_1.dodajIspit(i1);
		student_1.dodajIspit(i2);
		student_1.dodajIspit(i3);
		student_1.dodajIspit(i4);
		student_1.dodajIspit(i5);
		student_1.dodajIspit(i6);
		student_1.dodajIspit(i7);
		student_1.dodajIspit(i8);
		student_1.dodajIspit(i9);
		student_1.dodajIspit(i10);

		student_1.print();

	}

}
