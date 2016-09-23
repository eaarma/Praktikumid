package praktikum2;

import org.w3c.dom.Text;

import lib.TextIO;

public class GrupiSuurus {
	public static void main(String[] args) {
		
		System.out.println("Sisesta inimeste arv");
		int inimesteArv = TextIO.getInt();
		
		System.out.println("Sisesta grupi suurus arv");
		int grupiSuurus = TextIO.getInt();
				
		int gruppideArv = inimesteArv / grupiSuurus;
		System.out.println("Saab moodustada " + gruppideArv + " gruppi");
		
		int j22k = inimesteArv % grupiSuurus;		
		System.out.println("Üle jääb " + j22k + " inimest");
	}
}
