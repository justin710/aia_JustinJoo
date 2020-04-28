package friend;

public class FriendMain {

	public static void main(String[] args) {

	//	FriendInfoHandler handler = new FriendInfoHandler(10);
		FriendInfoHandler handler = FriendInfoHandler.getInstance();
		while (true) {
			System.out.println("======메뉴를 선택해주세요=====");
			System.out.println(" "+Menu.INSERT_HIGH+". 고교 정보 저장");
			System.out.println("2. 대학 친구 저장");
			System.out.println("3. 기본 정보 출력");
			System.out.println("4. 전체 정보 출력");
			System.out.println("5.  종료");
			System.out.print("=====================");
		
			
			int choice = handler.kb.nextInt();
		
			
			handler.kb.nextLine(); // 앞의 버퍼 클리어
		

			switch (choice) {
			case Menu.INSERT_HIGH:
			case Menu.INSERT_UNIV:
				handler.addFriend(choice);
				break;
			case Menu.INSERT_BASIC:
				handler.showAllSimpleData();
				break;
			case Menu.INSERT_ALL:
				handler.showAllData();
				break;
			case Menu.EXIT:
				System.out.println("프로그램을 종료합니다.");
			
				
				return;
				
			}
		}
	}
}
