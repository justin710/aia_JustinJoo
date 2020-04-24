package ver04;

import java.util.Scanner;

public class PhoneBookManager {

	
	PhoneInfor createInstance() {
		
		PhoneInfor info = null;
		
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("친구 정보를 입력해 주세요");
		System.out.println("이름을 입력해주세요");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력해주세요");
		String phoneNumber = sc.nextLine();
		System.out.println("생년월일을 입력해주세요");
		String birthday = sc.nextLine();
		
		if(birthday==null||birthday.trim().isEmpty()) {
			info = new PhoneInfor(name, phoneNumber); 
			} else {
				info = new PhoneInfor(name, phoneNumber, birthday);
			}
		return info;
		}
	}

