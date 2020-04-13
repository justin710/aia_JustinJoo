package OperatorEx;

public class OperatorEx12 {

	public static void main(String[] args) {
		int a = 1000000 * 100000 / 1000000; // int 범위를 넘어가서 원하는 답이 안나옴
		int b = 1000000 / 100000 * 1000000; // 먼저 나누었기에 범위내라서 원하는 답이 나옴
		System.out.println(a);
		System.out.println(b);
	}
}