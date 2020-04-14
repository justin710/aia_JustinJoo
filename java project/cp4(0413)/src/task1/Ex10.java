package task1;

public class Ex10 {

	
	// for 문을 이용하여 구구단 중 5단을 출력하는 프로그램 작성
	public static void main(String[] args) {

		int result = 0;
		
		for(int num=1; num<10; num++) {
			result = 5*num;
			System.out.println(5+"x"+num+"="+result);
		}

	}

}
