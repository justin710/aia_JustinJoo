package op;

public class ArithOp {

	public static void main(String[] args) {
		// 정수타입 숫자 두개를 받는다 변수선언		
		int num1 = 10;
		int num2 = 3;
		
		int result = num1 + num2; //덧셈연산 결과를 출력하자
		System.out.println("덧셈 결과: " + result);
	

		result = num1 - num2; //뺄셈연산 결과를 출력하자
		System.out.println("뺄셈 결과: " + result);
		
		result = num1 * num2; //곱셈연산 결과를 출력하자
		System.out.println("곱셈 결과: " + num1 * num2);
		
		result = num1 / num2; //나눗셈연산 결과를 출력하자
		System.out.println("나눗셈 결과: " + num1 / num2);
		
		result = num1 % num2; //나머지연산 결과를 출력하자
		System.out.println("나머지 결과: " + num1 % num2);
	}
}