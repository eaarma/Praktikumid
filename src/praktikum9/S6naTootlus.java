package praktikum9;

import lib.TextIO;

public class S6naTootlus {

	public static void main(String[] args) {

		System.out.println("Sisesta sõna");
		String s6na = TextIO.getlnString();
		tryki(s6na);

	}

	public static void tryki(String sisend) {
		System.out.println(sisend.toUpperCase());
		for (int i = 0; i < sisend.length(); i++) {
			System.out.print(sisend.toUpperCase().charAt(i));
			if (i < sisend.length() - 1) {
			System.out.print("-");
				}
			
		}
	}
}
