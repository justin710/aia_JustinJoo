package call;

public class MemberCall {

	
	//인스턴스 변수
	
	 int iv = 10;
	 
	 //클래식 변수, 스테틱 변수
	 
	  int cv =100;
	 
	 int iv2=cv;
	 
	 //static int cv2 = 
	 static int cv2 = new MemberCall().iv;
	 
	 
	 
	static void staticMethod() {
		 //스테틱 멤버 출력
		 //System.out.println(cv); 이건 안됨 밑에처럼 바꿔줘야함
		 
		 MemberCall mc = new MemberCall();
		 System.out.println(mc.iv);
		 
		 //인스턴스 멤버 출력
		 //System.out.println(iv); 스테틱이면 안된다 스테틱으로 바꿔주거나 인스턴트로 지정하거나		 
	 
	 }
	 
}
