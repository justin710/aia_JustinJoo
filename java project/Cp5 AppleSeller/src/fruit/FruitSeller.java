package fruit;


/*
작성자 : 주효식
수정일 : 2020.04.17
수정내용 : 생성자를 통한 변수 초기화 , 현재 데이터 출력 메서드 생성(showResult)
*/
public class FruitSeller {

	// 속성 => 변수
	// 사과의 개수
	// 수입
	// 사과의 가격
	// 멤버 변수, 인스턴스 변수
	// 수정 : 변수의 명수적 초기화 변경
	
//생략 생성자	int numOfApple = 20; // 사과의 개수, 멤버 변수, 인스턴스 변수
//생략 생성자	int myMoney = 0; // 수입
//생략 생성자	final int APPLE_PRICE = 1000;// 사과의 가격

	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;
	
	//생성자
	FruitSeller(){
	//this로 인해 삭제	numOfApple = 20;
	//this로 인해 삭제	myMoney = 0;
	//this로 인해 삭제	APPLE_PRICE = 1000;
		
		this(20,0,100);
	}

	FruitSeller(int num, int money, int price){
		numOfApple = num;
		myMoney = money;
		APPLE_PRICE = price;
	}
	
	
	
	// 기능 : 메소드
	// 1.돈을 받는다 => 매개변수 money
	// 2.받은 돈의 사과의 개수를 구한다
	// 3.나의 사과 개수에서 반환해야하는 사과의 개수를 빼준다
	// 4.받은 금액은 나의 수입으로 더해준다
	// 5.사과의 개수를 반환한다 => 반환 데이터 int return 사과의 개수
	int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money; // myMoney=myMoney+money;

		return num;
	}

	void showResult() {
		System.out.println("현재 보유금액"+myMoney+"현재 사과개수"+numOfApple);
	}
	
	
}


