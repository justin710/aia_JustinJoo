package ex;

public class CodeToChar { //유니코드 65의 문자를 출력 하시오

	public static void main(String[] args) { 
		
		int code = 65; // 또는 int code = 0x0041;     4byte
		char ch = (char) code; //명시적 형변환
		System.out.println(code); // 유니코드 65가 나와야함
		System.out.println(ch);   // 유니코드 65의 문자형인 A가나와야함
	}
}