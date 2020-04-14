package task1;

public class ex3 {

	/*
	 * int num1 = 50, num2 = 100;
	 * 
	 * int big, diff;
	 * 
	 * big = (num1 > num2) ? num1 : num2;
	 * 
	 * System.out.println(big);
	 * 
	 * diff = (num1 > num2) ? num1 - num2 : num2 - num1;
	 * 
	 * System.out.println(diff);
	 */

	public static void main(String[] args) {
		int num1 = 50, num2 = 100;
		if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}

		if (num1 > num2) {
			System.out.println(num1 - num2);
		} else {
			System.out.println(num2 - num1);
		}
	}

}
