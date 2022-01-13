package domaci_13_1_2022;

import domaci_11_1_2022.FacebookPost;

public class D_Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FacebookPost fp1 = new FacebookPost ("Jovana Vujovic", "Ksenija Vujovic", "Happy Birthday! ♥");
		
		
		fp1.like();
		fp1.like();
		fp1.like();
		fp1.dislike();
		fp1.share();
		fp1.share();
		
		fp1.print();
		
		System.out.println();
		
		FacebookPost fp2 = new FacebookPost ("Ksenija Vujovic", "Jovana Vujovic", "Love u! ♥");
		
		fp2.like();
		fp2.like();
		fp2.share();
		fp2.share();
		fp2.share();
		
		fp2.print();
		
		

	}

}
