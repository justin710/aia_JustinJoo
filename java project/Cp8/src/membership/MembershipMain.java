package membership;

public class MembershipMain {

	public static void main(String[] args) {

		// 회원 정보 5개를 저장 할 수 있는 배열을 생성
		//Member 타입의 인스턴스의 참조값을 저장하는 메모리 공간
		///Member m1,m2,m3,m4,m5
		Member[] members =  new Member[5]; 
		
		members[0] = new Member("cool","시원한","cool@gamil.com"); ////Member 타입의 인스턴스 주소
		members[1] = new Member("hot","뜨거운","hot@gamil.com");
		members[2] = new Member("money","돈","money@gamil.com");
		members[3] = new Member("elephant","코끼리","elephant@gamil.com");
		members[4] = new Member("apple","사과","apple@gamil.com");
		
		for(int i=0; i<members.length; i++) {
			System.out.println(members[i]);
			
		}
		System.out.println("================");
		
		for(int i=0; i<members.length; i++) {
			members[i].showInfo();
			System.out.println(members[i]);
			System.out.println("----------------");
		}
		
		
		
	// member = new Member("cool","시원한","cool@gamil.com");
		
//		member().showInfo();
//		System.out.println("----------------");
		
//		System.out.println(member); //member.toSting() 호출
	
	}

}
