package ex;

public class BusinessMan extends Man {

	
	String company;
	String position;
	
	
	//조상클래스에 생성자가 있다면 자손클래스의 생성자에서 
	//값을 받아 조상클래스의 생성자를 호출해서 초기화 해 준다.
	BusinessMan(String name,String company,String position){
		super(name);
		this.company=company;
		this.position=position;
		

	}
	void tellYourInfo() {
		//super.tellYourName(); 이거인데 밑에처럼 표시해도됨
		tellYourName();
		System.out.println("나의 직장 이름은 "+company+"입니다");
		System.out.println("나의 직급은 "+position+"입니다");
	}
}