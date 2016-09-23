package praktikum4;

import lib.TextIO;

public class tehisIntellekt {

	public static void main(String[] args) {
		
	System.out.println("Sisesta kaks vanust");
	int vanusYks = TextIO.getlnInt();
	int vanusKaks = TextIO.getlnInt();
	
	int vanuseVahe = Math.abs(vanusYks-vanusKaks);
	
	if (vanuseVahe >10) {
		System.out.println ("Sick");
	} else if (vanuseVahe > 5) {
		System.out.println("Earthworm");
	} else if (vanuseVahe < 5) {
		System.out.println("Damn straight");
	}
	}
	
	
		
}
