package praktikum11;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fibb(6));

	}

	private static int fibb(int i) {
		if (i <= 1) { 
			return i;
		}
		return fibb(i - 1) + (i - 2);
		
	}
}