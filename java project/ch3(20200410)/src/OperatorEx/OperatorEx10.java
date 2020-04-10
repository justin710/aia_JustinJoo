package OperatorEx;

public class OperatorEx10 {

	public static void main(String[] args) {
		int a = 1000000; // 1,000,000 1백만
		int b = 2000000; // 2,000,000 2백만
		// long c = a * b; 
		// int 범위가 넘어가서 원하는 결과가 안나온다  2,000,000,000,000
		long c = (long)a * b; // 이런식으로 바꾸면 결과가 나온다
		
		System.out.println(c);
	}
}