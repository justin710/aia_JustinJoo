package ex;

public class SwitchBasic2 {

	public static void main(String[] args) {

		int menuNum = 3;

		switch (menuNum) {

		case 1:
			System.out.println("Simple JAVA");
			break;
		case 2:
			System.out.println("Funny JAVA");
			break;
		case 3:
			System.out.println("Fantastic JAVA");
			break;

		default:
			System.out.println("The best programming language");
			
		}
		System.out.println("Do you like coffee?");

	}

}
