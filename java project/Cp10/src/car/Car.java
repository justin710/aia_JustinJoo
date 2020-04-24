package car;

public class Car {

	String color;
	int door;

	void drive() { // 운전하는 기능
		System.out.println("운전");
	}

	void stop() { // 멈추는 기능
		System.out.println("멈춤");
	}
}

public static void main(String args[]) {
Car car = null;
FireEngine fe = new FireEngine();
FireEngine fe2 = null;
}


class FireEngine extends Car { // 소방차
	void water() { // 물을 뿌리는 기능
		System.out.println("물 뿌리기");
	}

}

class Ambulance extends Car {
	void water
}
