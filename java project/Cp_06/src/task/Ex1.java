package task;

public class Ex1 {

	public static void main(String[] args) {
		// 문제 1. 다음 형태로 String 인스턴스를 생성. String str = “ABCDEFGHIJKLMN”;

		// 그리고 이 문자열을 역순으로 다시 출력하는 프로그램을 작성.

		String str = "ABCDEFGHIJKLMN";

		System.out.println(str.length());

		for (int i = str.length() - 1; i >= 0; i--) {

			System.out.print(str.charAt(i));

		}

		System.out.println();

	}

}
