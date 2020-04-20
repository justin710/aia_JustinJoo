package task2;

public class Ex4 {

	public static void main(String[] args) {
		// [4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때,
		// 몇까지 더해야 총합이 100이상이되는지 구하시오.

		int sum = 0;

		int num = 1;

		while (true) {

			if (num % 2 == 0) {

				sum = sum-num;

			}

			else {

				sum = sum+num;

			}

			if (sum >= 100) {

				System.out.println(sum + "," + num);

				break;

			}

			num++;

		}

	}

}
