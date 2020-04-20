package task2;

public class Ex5 {

	public static void main(String[] args) {
	/*	[5] 다음의 for문을 while문으로 변경하시오.

		[연습문제]/ch4/Exercise4_5.java

*/
		int i = 0;
	
		while(i <= 10){
		  int  j = 0;
		    while(j <= i ){
		        System.out.print("*");
		        j++;
		    }
		    i++;
		    System.out.println();
		}
	}
}


