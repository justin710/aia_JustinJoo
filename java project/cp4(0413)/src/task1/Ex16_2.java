package task1;

public class Ex16_2 {

	/*
	 * 문제16. 1 부터 99까지의 합을 구하는 프로그램 작성 while문, for문, do while 문을 각각 사용
	 */

	public static void main(String[] args) {

		int sum = 0;
		int num = 1;

		while (num < 100) {
			sum += num;
			num++;
			
		}
		System.out.println(sum);
	}

}
