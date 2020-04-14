package task1;

public class ex7 {

	/*
	 * public static void main(String[] args) {
	 * 
	 * int num = 0;
	 * 
	 * while (num < 100) { num++; System.out.println(num); }
	 * 
	 * while (num > 0) { num--; System.out.println(num); } }
	 * 
	 * }
	 */

	public static void main(String[] args) {

		int num = 1;

		do {
			System.out.println(num);
			num++;
		} while (num < 100);

		do {
			System.out.println(num);
			num--;
		} while (num > 0);

	}

}