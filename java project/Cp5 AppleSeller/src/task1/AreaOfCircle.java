package task1;

/*문제3

원의 반지름 정보를 전달하면, 원의 넓이를 계산해서 반환하는 메서드와 원의 둘레를 계산해서 반환하는 메서드를 각각 정의하고, 
이를 호출하는 main메서드를 정의하자. (2*π*r), (π*r∧2)*/

public class AreaOfCircle {

	
	  double circle(int r){
	        return 2 * Math.PI * r;
	    }

	    double area(int r){
	        return Math.PI * (r * r);
	    }
	}
