package scm;


public class ScmMain {

	public static void main(String[] args) {
	
		
		// 상속관계에서 다형성
		//상위 클래스 타입의 참조변수 = 하위클래스의 인스턴스
		Product p = new Tv(100); //생성자는 값을 넣어줘야 한다
		
		//System.out.println(p1);
		
		Tv tv = new Tv(10);
		Computer com = new Computer(20);
		Audio aud = new Audio(30);
		
		int sum = tv.price+com.price+aud.price;
		
		Product p1 = tv;
		Product p2 = com;
		Product p3 = aud;
		
		// 상위 클래스 타입의 배열 생성
		Product[] products = new Product[3];
		products[0] = new Tv(100);
		products[1] = new Computer(200);
		products[2] = new Audio(500);
		
		int sumOfPrice = 0;
		int sumOfPoint = 0;
		
		/*
		 * for(int i=0; i<products.length; i++) { System.out.println(products[i]);
		 * sumOfPrice += products[i].price; sumOfPoint += products[i].bonusPnint;
		 * 
		 * System.out.println("전체 제품의 가격의 합은 :" + sumOfPrice);
		 * System.out.println("전체 제품의 가격의 합은 :" + sumOfPoint); }
		 */
		
		// 구매자가 제품을 구매하는 시뮬레이션 
		// 구매자 생성
		Buyer buyer = new Buyer();
		
		//제품 생성 
		//객체 생성
		Tv product1 = new Tv(100);
		Computer product2 = new Computer(250);
		Audio product3 = new Audio(100);
		
		// tv 구매
		buyer.buy(product1);
		//컴퓨터구매
		buyer.buy(product2);
		//오디오 구매
		buyer.buy(product3);
		//컴퓨터구매
		buyer.buy(product2);
	
		
		//System.out.println("현제 보유금액 :" + buyer.money);
		//System.out.println("현제 보유포인트 :" + buyer.bonusPoint);
	
		buyer.summary();
	
	}

}
