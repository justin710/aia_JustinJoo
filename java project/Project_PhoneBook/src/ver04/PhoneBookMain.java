package ver04;


public class PhoneBookMain {

	public static void main(String[] args) {
		
		PhoneBookManager manger = new PhoneBookManager();
		
		PhoneInfor info = null;
		
		while(true) {
			info = manger.createInstance();
			info.showInfo();
		}
		
	}
}
