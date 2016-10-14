package praktikum8;

public class Kuulujutt {

	public static void main(String[] args) {

		String[] meheNimed = { "Ants", "Aleksei", "Jyri" };
		String[] naisteNimed = { "Kati", "Natali", "Mari" };
		String[] Tegevused = { "Söövad", "Tõstavad", "Viskavad" };

		String suvalineNimi = suvalineElement(meheNimed);
		

		String suvalineNimi1 = suvalineElement(naisteNimed);
		

		String suvalineTegevus = suvalineElement(Tegevused);

		System.out.format("%s ja %s %s.", suvalineNimi, suvalineNimi1, suvalineTegevus);
		
	}


	private static String suvalineElement(String[] s6nad) {
		// TODO Auto-generated method stub
		return s6nad[0];
	}
}
