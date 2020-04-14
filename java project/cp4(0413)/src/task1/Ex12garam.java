package task1;

public class Ex12garam {
	public static void main(String[] args) {

	int num12 = 1;

	int sum12 = 0;

	while(true)
	{

		if (num12 % 2 != 0) {

			sum12 += num12;

		}

		else if (num12 % 2 == 0) {

			if (num12 % 3 == 0) {

				sum12 += num12;

			}

		}

		if (sum12 > 1000) {

			System.out.println(num12);

			System.out.println(sum12);

			break;

		}

		num12++;

	}

	System.out.println("----------------------------------------");
}}
