package ex;

public class Method1 {

	public static void main(String[] args) {
		// 메서드를 사용하기 위해서는 인스턴스(객체)를 생성
		//메서드 코드를 메모리에 로드한다
		//인스턴스 생성(객체생성)
		MyMath math = new MyMath();
		
		long result= math.add(10,100);
		
		System.out.println(result);
		System.out.println(math.add(10000000L,20000000L));
	}

	int add() {
		return 10;
	}
	
}
