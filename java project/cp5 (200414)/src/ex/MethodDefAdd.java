package ex;

public class MethodDefAdd {

	public static void main(String[] args) {
		
		System.out.println("프로그램시작");

		hiEveryone(7, 110.5);
		hiEveryone(20, 180.2);
		hiEveryone(17, 178.9);
		hiEveryone(25, 200);
		hiEveryone(15, 163.6);
		hiEveryone(19, 100);
		
		
		
		System.out.println("프로그램종료");
	}
	// 인사말 출력, 나이값을 받아서 나이를 출력하는 메서드
	static void hiEveryone(int age,double height) {
		System.out.println("안녕하세요");
		
		if (age<10) {
			return;
		}
		System.out.println("제 나이는 "+age+"입니다");
		System.out.println("저의 키는"+height+"cm 입니다");
	}
	
}
