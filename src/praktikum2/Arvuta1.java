package praktikum2;

import lib.TextIO;

public class Arvuta1 {

public static void main(String[] args)  {
	//muutujate deklareerimine
	int arv1;
	int arv2;
	int korrutis;
	
	System.out.println("Palun sisesta kaks arvu");
	
	//muutujate väärtustamine
	arv1 = TextIO.getlnInt();
	arv2 = TextIO.getlnInt();
			
	//arvude korrutamine
	korrutis = arv1 * arv2;
	
	//väljastame korrutise
	System.out.println(korrutis);
	
}	






}
