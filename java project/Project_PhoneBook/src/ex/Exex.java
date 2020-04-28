package ex;

public class Exex {

	public static void main(String[] args) {

		for (int k = 1; k <= 100; k++) {

			if (prime(k)) {

				System.out.println(k);

			}

		}

	}

	static boolean prime(int a) {

		boolean result = true;

		if (a <= 1) {

			result = false;

		}

		for (int i = a - 1; i > 1; i--) {

			if (a % i == 0) {

				result = false;

				break;

			}

		}

		return result;

	}
}