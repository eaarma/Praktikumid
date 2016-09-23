package praktikum4;

import lib.TextIO;

public class Kaal {
	public static void main(String[] args) {
		System.out.println("Palun sisesta lõputöö hinne");
		int l9putoo = TextIO.getlnInt();
		System.out.print("Sisesta keskmine hinne");
		double keskhinne = TextIO.getlnDouble();
		
		System.out.print(keskhinne);


		if (keskhinne == 5) {
			System.out.println("Unreal");
		} else if (keskhinne > 4.5) {
			System.out.println("Väga hea keskmine hinne");
		} else if (keskhinne > 4.5-5.0 && l9putoo == 5) {
			System.out.println("Saad cum laude");
		} else if (keskhinne > 5 && l9putoo > 5) {
			System.out.println("Error 404, user can't number");
		
		} else if (keskhinne < 4.5) {
			System.out.println("Ei saa");
		;

	}

}}