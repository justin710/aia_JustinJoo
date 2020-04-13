package ex;

public class ByTimes1 {

	public static void main(String[] args) {
		// 구구단
		// 단 * 1~9 = 결과 : 2*1=2

		// 단
		int i = 1;
		while (i < 9) {
			i++;	
			System.out.println(i + "단");
			System.out.println("--------------");
			
			int j = 1;
			while (j < 10) {
				System.out.println(i + "x" + j + "=" + i * j);
				j++;

			}

		}

	}
}
