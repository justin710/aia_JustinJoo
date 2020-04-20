package task2;

public class Ex1 {

	public static void main(String[] args) {
	
		// 1.다음의 문장들을 조건식으로 표현하라.

		  //int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식

		  int x1=11;

		  boolean result = false;

		  

		  if(x1>10 && x1<20) {

			  result = true;

		  }

		  System.out.println(result);

		  // 2.char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식

		  char ch1_1=' ';

		  

		  if(ch1_1!=' ' || ch1_1!='\t') {

			  result = true;

		  }

		  System.out.println(result);

		  //3.char형 변수 ch가 'x'또는 'X'일 때 true인 조건식

		  char ch1_2='x';

		  

		  if(ch1_2=='x' || ch1_2=='X') {

			  result = true;

		  }

		  System.out.println(result);

		  //4.char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식

		  char ch1_3='8';

		  

		  if(ch1_3>='0' && ch1_3<='9') {

			  result = true;

		  }

		  System.out.println(result);

		  //5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식

		  char ch1_4='x';

		  

		  if(ch1_4>='A' && ch1_4<='Z' || ch1_4>='a' && ch1_4<='z') {

			  result = true;

		  }

		  System.out.println(result);

		  //6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식

		  int year=400;

		  

		  if(year%400==0 || year%4==0 && year%100!=0) {

			  result = true;

		  }

		  System.out.println(result);

		  //7. boolean형 변수 powerOn가 false일 때 true인 조건식

		  boolean powerOn=false;

		  

		  if (powerOn=false) {

			  result = true;

		  }

		  System.out.println(result);

		  //8. 문자열 참조변수 str이 "yes"일 때 true인 조건식

		  String str1 = "no";

		  

		  if(str1=="yes") {

			  result = true;

		  }

		  System.out.println(result);

	}
}
