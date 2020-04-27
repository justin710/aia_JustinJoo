package ver04;

public class PhoneCafeInfo extends PhoneInfo {

	String cafeName;
	String nickName;

	PhoneCafeInfo(String name, String phoneNumber, String addr, String email, String cafeName, String nickName) {
		super(name, phoneNumber, addr, email);
		this.cafeName = cafeName;
		this.nickName = nickName;
	}

	@Override
	void showAllInfo() {
		showBasicInfo();
		System.out.println("동호회이름 : "+cafeName);
		System.out.println("별명 : "+nickName);
	}

}
