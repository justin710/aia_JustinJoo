package task1;

/*문제4. 전달되는 값이 소수(prime number)인지 아닌지를 판단하여, 소수인경우 true를, 소수가 아닌 경우 false를 반환하는 메서드를 정의하고, 
이를 이용해서 1이상 100 이하의 소수를 전부 출력할 수 있도록 main 메서드를 정의하자.*/

public class PrimeNumber {
	public static void main(String[] args) {

		int primeCount = 0;

		// 1부터 100까지 사이의 소수(Prime number)를 표시하는 프로그램

		// 소수의 정의: 약수가 1과 자신뿐인 1보다 큰 정수

		for (int i = 2; i < 100; i++) { // 1은 제외해야 하기 때문에 2부터 시작

			int c = 0; // 이 변수(카운터)로 소수인지를 판가름합니다

			for (int j = 1; j <= i; j++) { // j=1부터 i까지(해당 숫자까지) 증가

				if (primeNum(i, j)) { // i를 j로 나누어 0이 남는지 검사

					c += 1;// 카운터를 증가시킴

				}

			}

			if (c == 2) { // 검사한 카운터가 2일 때(소수인지 확인)

				System.out.print(i + ","); // 출력

				primeCount++;

			}

		}

		System.out.println("");

		System.out.println("소수의 숫자 : " + primeCount);

	}

	// 소수의 정의 : 1과 자기 자신만이 나눌 수 있는 값.

	static boolean primeNum(int i, int j) {

		return i % j == 0 ? true : false;

	}
}
