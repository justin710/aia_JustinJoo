package ex;

public class CastingOperation { //대문자 'A'의 유니코드 값, 대문자 'Z'의 유니코드값

	public static void main(String[] args) {
		char ch1='A'; //문자타입의 변수 ch1 선언, 초기화 'A'저장 대입
		char ch2='Z';
		
		int num1=ch1; //대입연산
		int num2=(int)ch2; 
		System.out.println("문자 A의 유니코드 값: "+num1);
		System.out.println("문자 Z의 유니코드 값: "+num2);
}
}