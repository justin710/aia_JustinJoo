package task2;

public class Ex9 {

	public static void main(String[] args) {
		String str9 = "12345";

		  int sum = 0;

		  for(int i=0; i < str9.length(); i++) {

		  

		   sum += (str9.charAt(i)-'0');



		  }

		  System.out.println("sum="+sum);
	}

}
