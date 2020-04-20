package ex;

public class InstanceArray {

	public static void main(String[] args) {
		
		// 참조형(String)변수를 저장하는 배열 생성
		String[] strArr = new String[3];
		
		// strArr[0] : 배열의 첫번째 참조변수
		strArr[0] = new String("Java");
		strArr[1] = new String("JS");
		strArr[2] = new String("Python");
		
		// String 타입의 참조변수 -> strArray[0]
		System.out.println("문자열의길이:"+strArr[0].length());
		
		// 배열의 순차적 참조 : 반복문을 이용해서 순차 참조가능
		for (int i = 0; i < strArr.length; i++)
			System.out.println(strArr[i]);
	}
}


		