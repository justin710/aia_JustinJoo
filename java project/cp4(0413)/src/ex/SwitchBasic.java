package ex;

public class SwitchBasic {

	public static void main(String[] args) {

		int menuNum = 6;

		switch (menuNum) {

		case 1:
			System.out.println("Simple JAVA");
		case 2:
			System.out.println("Funny JAVA");
		case 3:
			System.out.println("Fantastic JAVA");

		default:
			System.out.println("The best programming language");
		}
		System.out.println("Do you like coffee?");

	}

}
