package ex;

public class ByteOverflow {

	public static void main(String[] args) {
		
		
		byte b = 0; // byte형 변수 b를 선언하고 0으로 초기화.
		int i = 0; // int형 변수 i를 선언하고 0으로 초기화.
		

		for (int x = 0; x <= 270; x++) {  // 반복문을 이용해서 b의 값을 1씩, 0부터 270까지 증가시킨다.
			System.out.print(b++); // 증감연산자 
			System.out.print('\t'); // tab을 출력한다.
			System.out.println(i++);
			
		}
	}
}