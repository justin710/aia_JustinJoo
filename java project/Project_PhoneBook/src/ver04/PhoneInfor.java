package ver04;

public class PhoneInfor {

	String name;
	String phoneNumber;
	String birthday;

	PhoneInfor(String name, String phoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday=birthday;
	}

	PhoneInfor(String name, String phoneNumber) {
		this(name, phoneNumber, "입력값이 없습니다");
	}

	void showInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("전화번호 : " + this.phoneNumber);
		System.out.println("생년월일 : " + this.birthday);
	}
}