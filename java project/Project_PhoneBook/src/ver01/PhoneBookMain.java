package ver01;

public class PhoneBookMain {

	public static void main(String[] args) {
		
		PhoneInfor info = new PhoneInfor("손흥민","010-1234-5678","2000.11.22");
				
		info.showInfo();
		
		info= new PhoneInfor("박지성","010-7777-8888");
		info.showInfo();
	}

}
