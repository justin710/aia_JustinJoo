package version_1;

public class PhoneInfor {

	/*
	 * Version 0.1 전화번호 관리 프로그램.
	 * 
	 * PhoneInfor 라는 이름의 클래스를 정의해 보자. 클래스는 다음의 데이터들의 문자열 형태로 저장이 가능 해야 하며, 저장된 데이터의
	 * 적절한 출력이 가능하도록 메소드 정의
	 * 
	 * • 이름 name String • 전화번호 phoneNumber String • 생년월일 birthday String
	 * 
	 * 단, 생년월일 정보는 저장할 수도 있고, 저장 않을 수도 있게끔 생성자 생성.
	 */

	String name;
	String phoneNumber;
	String birthday;

	PhoneInfor() {
	}

	PhoneInfor(String n, String p, String b) {
		name = n;
		phoneNumber = p;
		birthday = b;
	}

	PhoneInfor(String n, String p) {
		this(n, p, "-");

	}

	void show() {

		System.out.println("이름 : " + name + ", 전화번호 : " + phoneNumber + ", 생년월일 : " + birthday);

	}

	public static void main(String[] args) {

// data1

		PhoneInfor data1 = new PhoneInfor("철수", "000", "0420");

// data2

		PhoneInfor data2 = new PhoneInfor("영희", "000");

// data3

		PhoneInfor data3 = new PhoneInfor();

		data1.show();

		data2.show();

		data3.show();

	}

}
