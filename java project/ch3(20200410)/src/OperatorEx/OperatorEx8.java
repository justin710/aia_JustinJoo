package OperatorEx;

public class OperatorEx8 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		// byte c = a+b;   이건 안됨
		byte c = (byte)(a+b);
		System.out.println(c);
	}
}