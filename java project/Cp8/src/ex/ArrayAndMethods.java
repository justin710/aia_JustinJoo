package ex;

public class ArrayAndMethods {
	
	// 배열(배열 참조변수)를 전달받고 , 증가시킬 정수값도 받아서 
	// 모든 배열의 요소에 더해준다
	// 전달 받은 배열을 반환한다
	
	public static int[] addAllArray(int[] ar, int addVal) {
		for (int i = 0; i < ar.length; i++)
			ar[i] += addVal;
		return ar;
	}

	public static void main(String[] args) {
		
		// 원본 배열 생성
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		
		//경과 저장 할 배열 선언
		int[] ref = addAllArray(arr, 7);
		
			System.out.println("동일 배열 참조여부 확인:"+(arr == ref));
	
		for (int i = 0; i < ref.length; i++)
			System.out.print(arr[i]);
	}
}
