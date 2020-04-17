package task1;


/*문제1

두 개의 정수를 전달받아서, 두수의 사칙연산 결과를 출력하는 메서드와 이 메서드를 호출하는 main메서드를 정의해보자.

단, 나눗셈은 몫과 나머지를 각각 출력해야 한다.*/

public class Arithmetic {
	
	int re = 0;

    int add(int a, int b){
        return a+b;
    }

    int sub(int a, int b){
        return a-b;
    }

    int multi(int a, int b){
        return a*b;
    }

    int div(int a, int b){

        re= a%b;

        return a/b;
    }
}
	

