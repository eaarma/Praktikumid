package praktikum5;

public class tabel {

	public static void main(String[] args) {

		int tabelisuurus = 7;

		for (int i = 0; i < tabelisuurus; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 0 && i == 0) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}

	}

}
