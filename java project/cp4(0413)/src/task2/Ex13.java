package task2;

public class Ex13 {

	public static void main(String[] args) {
		  String value13 = "12o34";

		  char ch13 = ' ';

		  boolean isNumber = true;




		  // 반복문과 charAt(inti)를 이용해서 문자열의 문자를

		  // 하나씩 읽어서 검사한다.

		  for(int i=0; i < value13.length() ;i++) { 

		   ch13 = value13.charAt(i);

		   if(ch13>=(int)'0' && ch13<=(int)'9') {

		    isNumber = true;

		   }

		   else {

		    isNumber = false;

		    break;

		   }

		   //System.out.println(value13+" "+ch13+" "+isNumber);

		  }




		  if (isNumber) {

		   System.out.println(value13+"는 숫자입니다.");

		  } else {

		   System.out.println(value13+"는 숫자가 아닙니다.");

		  }
	}

}
