package task2;

public class TtttGggg {

	// 변수 : 밑변 과 높이
	int width; // 밑변의 데이터
	int height; // 높이 데이터
	
	
	// 생성자 : 인스턴스 생성시에 반듯이 한번 실행한다 -> 인스턴스 변수들의 초기화작업
	//			생략가능 (default Contructor)
	// 변수랑 메서드 사이에 생성자를 만든다
	
	//기본 생성자
	TtttGggg(){
		
	}
	TtttGggg(int w, int h){
		width = w;
		height = h;
	}

	// 밑변과 높이 데이터를 변경하는 메서드   생성자 생기면 필요없어짐
	//void setData(int w, int h) {
	//	width = w;
	//	height = h;
	//}

	// 삼각형의 넓이를 구해서 반환하는 메서드

	float area() {
		float result = width * height / 2f;
		return result;

	}

	public static void main(String[] args) {
		// 스테틱을 붙여주면 전역 메소드

		// 삼각형 객체를 생성

		TtttGggg t = new TtttGggg(5,3);// 생성자 데이터 설정
		
		

		System.out.println("삼각형의 밑변" + t.width + "높이" + t.height);

		// 삼각형의 넓이를 구하는 메서드 실행
		System.out.println("삼각형의 넓이는" + t.area());
	}

}