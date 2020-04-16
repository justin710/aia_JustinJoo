package task1;

public class Ex13_2 {
	// 구구단의 짝수 단(2,4,8)만 출력하는 프로그램 작성.
//단, 2단은 2x2까지, 4단은 4x4까지, 8단은 8x8 까지 출력
	
	
	public static void main(String[] args) {

		for (int num = 2; num < 10; num *= 2) {

			for (int num2 = 1; num2 <= num; num2++) {

				System.out.println(num + "x" + num2 + "=" + (num * num2));

			}

		}

	}

}
