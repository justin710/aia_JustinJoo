package task1;

/*문제2.

두 개의 정수를 전달 받아서, 두수의 절대값을 계산하여 출력하는 메서드와 이 메서드를 호출하는 main메서드를 정의해 보자. 
단 메서드 호출 시 전달되는 값의 순서에 상관없이 절대값이 계산되어서 출력되어야 한다.*/

public class Absolute {
	

		
		int re = 0;

	    int add(int a, int b){
	        return Math.abs(a+b);
	    }

	    int sub(int a, int b){
	        return Math.abs(a-b);
	    }

	    int multi(int a, int b){
	        return Math.abs(a*b);
	    }

	    int div(int a, int b){

	        re= Math.abs(a%b);

	        return Math.abs(a/b);
	    }
	}
		


