package task1;

public class ArithmeticMain {

	public static void main(String[] args) {
		Arithmetic arithmetic = new Arithmetic();

	        int num1 =9;
	        int num2 =2;

	        System.out.println("덧셈 " + arithmetic.add(num1,num2));
	        System.out.println("뺄셈 " + arithmetic.sub(num1,num2));
	        System.out.println("곱셈" + arithmetic.multi(num1,num2));
	        System.out.println("나눗셈" + arithmetic.div(num1,num2));
	        System.out.println("나머지" + arithmetic.re);
	    }
	

	}


