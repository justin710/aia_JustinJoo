package OperatorEx;

public class OperatorEx11 {

	public static void main(String[] args) {
		long a = 1000000 * 1000000;  // 변환 안되서 원하는 결과 안나옴
		long b = 1000000 * 1000000L; // long형 리터럴
		System.out.println(a);
		System.out.println(b);
	}
}