package praktikum9;

import lib.TextIO;

public class Palindroom {

	public static void main(String[] args) {

		System.out.println("Sisesta sõna");
		String s6na = TextIO.getlnString();
		if (onPalindroom(s6na)) {
			System.out.println("See sõna on palindroom");
		} else {
			System.out.println("See sõna ei ole palindroom");
		}

	}

	public static boolean onPalindroom(String s6na) {

		if (s6na.equals(tagurpidi(s6na))) {
			return true;
		} else {
			return false;
		}
	}

	public static String tagurpidi(String oigetpidi) {
		String tagurpidi = "";
		for (int i = 0; i < oigetpidi.length(); i++) {
			tagurpidi = oigetpidi.charAt(i) + tagurpidi;

		}
		return tagurpidi;
	}
}
