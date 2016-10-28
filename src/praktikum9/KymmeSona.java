package praktikum9;

import java.util.Arraylist;

import lib.TextIO;

public class KymmeSona {

	public static void main(String[] args) {

		String[] s6nad = new String[3];

		for (int i = 0; i < s6nad.length; i++) {

			System.out.println("Palun sisesta sõna nr " + i);

			s6nad[i] = TextIO.getlnString();

		}

		for (int i = 0; i < s6nad.length; i++) {

			System.out.println(s6nad[i].length() + " " + s6nad[i]);

		}

	}

}

// ctrl a + ctrl 7