package task1;

public class Ex9 {

	
	//for 문을 이용하여 1부터 10까지를 곱해서 그 결과를 출력하는 프로그램을 작성
	public static void main(String[] args) {
	
		int result = 1;
		for(int num=1; num<11; num++ ) {
			result = result*num;
		
		}
		System.out.println(result);
	}
	

}
