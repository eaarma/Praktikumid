package praktikum8;

import lib.TextIO;

public class Arvud {

	public static void main(String[] args) {

		int arvud[] = new int[10];

		for (int i = 0; i < arvud.length; i++)
			;
		System.out.println("Sisesta arv masiivi indeksile " + i);
		arvud[i] = TextIO.getlnInt();
	}

	// for (int i = arvud.length - 1; i >= 0; i--) {
	// System.out.println("Massiivi väärtus kohal " + i + " on " + arvud[i]);
	// }

	public static int[] tagurpidi(int[] numbrid) {
		int[] tagurpidi = new int[numbrid.length];
		for (int i = 0; i < tagurpidi-length; i++) {
			int indeks = numbrid.length - 1 - i;
			tagurpidi[i] = numbrid[indeks];
			
			return tagurpidi 
		}
	}
}
