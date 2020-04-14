package task1;

public class ex5 {
//문제 2의 답안 코드를 switch 문으로 변경하여 보자.

//num < 0 이라면 “0 미만” 출력 부분은 if문을 사용하고 나머지 조건에 대해 변경하세요.

	public static void main(String[] args) {

		int num = -10;

		if (num < 0) {

			System.out.println("0 미만");
		}

		else {
			switch (num / 100) {

			case 0:

				System.out.println("0 이상 100미만");

				break;

			case 1:

				System.out.println("100 이상 200미만");

				break;

			case 2:

				System.out.println("200 이상 300미만");

				break;

			default:
				System.out.println("300이상");
				break;

			}

		}
	}
}
