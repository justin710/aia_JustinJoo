package ex;

public class AccessArray {

	public static void main(String[] args) {

		// int 타입의 정수 데이터 3개를 저장할 수 있는 배열을 생성
		// 배열의 이름 arr로 선언하자
		// 배열의 선언
		// int[] arr;
		// 배열 인스턴스 생성 : 각 요소의 저장공간 생성
		// arr = new int[3];

		int[] arr = new int[3];// 합쳐서
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		int sum = arr[0] + arr[1] + arr[2];
		System.out.println(sum);
	}
}
