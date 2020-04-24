package scm;


//상품 객체들의 상위 클래스
public class Product {

	final int price; // 제품 가격
	final int bonusPnint; // 제품의 포인트
	
	Product(int price){
		this.price=price;
		this.bonusPnint=this.price/10;
	}
	
	
}
