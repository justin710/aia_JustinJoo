package friend;

import java.util.Scanner;

public class FriendInfoHandler {

	// Friend 타입의 정보를 저장할 배열을 가진다
	// 친구 정보를 저장하는 기능
	// 친구정보의 기본 정보 출력 기능
	// 친구정보 상세 정보 출력 기능

	private Friend[] myFriends; // Friend 타입의 배열 선언 (생성아님 선언만 한거임)
	private int numOfFriends; // 저장된 친구의 정보 개수 (저장할 배열의 인덱스 반복할 횟수)

	Scanner kb; // Scanner sc=new Scanner(System.in);

	// 생성자 초기화!! 저장공간(사이즈) 크기를 받아서 배열을 생성
	FriendInfoHandler(int num) {
		myFriends = new Friend[num];
		numOfFriends = 0;
	
		kb=new Scanner(System.in);


	}

	// 친구의 정보를 저장하는 기능
	// 1. 배열에 저장하는 기능
	// 2. 사용자에게 데이터를 받아 사용자 요청에 맞는 인스턴스 생성

	// 1. 배열에 저장하는 기능
	void addFriendInfo(Friend f) {
		// 배열에 저장
		myFriends[numOfFriends] = f;
		numOfFriends++;
	}
	// 2. 사용자에게 데이터를 받아 사용자 요청에 맞는 인스턴스 생성
	// HighFriend / UnivFriend 타입이 다르니 다르게 받아야 한다

	void addFriend(int choice) {

		// 기본정보 받기
		System.out.println("이름을 입력해주세요");
		String name = kb.nextLine();
		System.out.println("전화번호를 입력해주세요");
		String phoneNum = kb.nextLine();
		System.out.println("주소를 입력해주세요");
		String addr = kb.nextLine();

		Friend friend = null;

		if (choice == 1) {
			// 1.일때 정보 받기
			System.out.println("직업을 입력해주세요");
			String work = kb.nextLine();

			// HighFriend 인스턴스 생성
			friend = new HighFriend(name, phoneNum, addr, work);
		} else {
			// 2.일때 정보 받기
			System.out.println("전공을 입력해주세요");
			String major = kb.nextLine();
			System.out.println("학년을 숫자로 입력해주세요");
			String grade = kb.nextLine();
			// Integer.parseInt(grade); 스트링을 인트로 바꿔주는 메소드

			// UnivFriend 인스턴스 생성
			friend = new UnivFriend(name, phoneNum, addr, major, Integer.parseInt(grade));
		}

		addFriendInfo(friend);
		// addFriendInfo 호출

	}

	// 친구정보의 기본 정보 출력 기능
	void showAllSimpleData() {
		System.out.println("친구의 기본정보를 출력합니다 =======");
		for (int i = 0; i < numOfFriends; i++) {
			myFriends[i].showBasicInfo();
			System.out.println("-------------------");
		}
	}
	// 친구정보 상세 정보 출력 기능
	void showAllData(){
		System.out.println("친구의 기본정보를 출력합니다 =======");
		for(int i=0; i<numOfFriends; i++){
		myFriends[i].showData();
		System.out.println("----------------------");
		
		}
	}
	
}