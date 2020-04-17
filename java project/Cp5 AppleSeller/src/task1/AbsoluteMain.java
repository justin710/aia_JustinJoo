package task1;

public class AbsoluteMain {

	public static void main(String[] args) {
		
		Absolute absolute = new Absolute();
		
		int a = -9;
		int b = -2;
		
		 System.out.println("덧셈 " + absolute.add(a,b));
	        System.out.println("뺄셈 " + absolute.sub(a,b));
	        System.out.println("곱셈" + absolute.multi(a,b));
	        System.out.println("나눗셈" + absolute.div(a,b));
	        System.out.println("나머지" + absolute.re);
	}

}
