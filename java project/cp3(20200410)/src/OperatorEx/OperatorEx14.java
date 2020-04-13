package OperatorEx;
//
//public class OperatorEx14 {
//
//	public static void main(String[] args) {
//		char c1 = 'a';
//	//	char c2 = c1+1    //에러 범위벗어남
//		char c2 = 'a'+1; 
//		System.out.println(c2); 
//		}
//}

class OperatorEx14 {
	public static void main(String[] args) {
		char c1 = 'a';
		// char c2 = c1+1;      컴파일 에러 
		char c2 = 'a' + 1; // 수정후  컴파일 에러 없음
		System.out.println(c2);
	}
}