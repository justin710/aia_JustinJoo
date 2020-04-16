package staticc;

public class AccessWayMian {

	public static void main(String[] args) {
		
		//스테틱변수 참조하는 방법
		System.out.println(AccessWay.num); 
		AccessWay.num++;
		
		AccessWay ac = new AccessWay();
		
		System.out.println(ac.num2);
	}

}
