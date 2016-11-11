package praktikum13;

public class RidadeSumma {

	int[][] neo = { { 1, 1, 1, 1, 1 }, { 2, 3, 4, 5, 6 }, { 3, 4, 5, 6, 7 }, { 4, 5, 6, 7, 8 }, { 5, 6, 7, 8, 9 }, };

	public static int[] ridadeSummad(int[][] maatriks) {
		int[] summad = new int[maatriks.length];
		for (int i = 0; i < maatriks.length; i++) {
			summad[i] = reaSumma(maatriks[i]);
		}
		return summad;
	}

	public static int reaSumma(int[] massiiv) {
		int summa = 0;
		for (int arv : massiiv) {
			summa += arv;

		}
		return summa;
		/*
		 * int sum = 0; int rida = array.length; int tulp = array[0].length;
		 * System.out.println("read" + rida + "veerud" + tulp); for (int i = 0;
		 * i < array.length; i++) { for (int j = 0; j < array[0].length; j++) {
		 * sum += array[i][j]; } System.out.println("Ridade summa = " + sum);
		 * 
		 */

	}
}
