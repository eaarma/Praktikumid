package praktikum13;

public class massiivid {

	public static void main(String[] args) {

		int[] arvud = { 3, 5, 7, 1, -4, 9 };
		tryki(arvud);

	}

	public static void tryki(int[] massiiv) {
		for (int i = 0; i < massiiv.length; i++) {
			System.out.print(massiiv[i] + "");
		}
		// for (int i : masiiv);
		// System.out.print(arv + "");
	}
}
