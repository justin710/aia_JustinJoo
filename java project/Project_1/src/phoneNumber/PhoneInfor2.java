package phoneNumber;

import java.util.Scanner;

public class PhoneInfor2 {
	/*
	
	 * "프로그램 사용자로부터 데이터 입력"
	 * 프로그램 사용자로부터 데이터를 입력 받아 클래스의 인스턴스를 생성하는 것이
	 * 핵심.
	 * 단 반복문을 이용해서 프로그램의 흐름을 계속 유지하도록 한다.
	 * 프로그램 종료를 하지 않으면, 다음과 같은 과정이 반복적으로 이루어짐.

	 * 키보드로부터 데이터 입력
	 * ↓
	 * 입력 받은 데이터로 인스턴스 생성
	 * ↓
	 * 생성된 인스턴스의 메소드 호출
	 */


	
	String name;
	String phoneNumber;
	String birthday;

	PhoneInfor2() {
	}

	PhoneInfor2(String n, String p, String b) {
		name = n;
		phoneNumber = p;
		birthday = b;
	}

	PhoneInfor2(String n, String p) {
		this(n, p, "-");

	}

	void show() {

		System.out.println("이름 : " + name + ", 전화번호 : " + phoneNumber + ", 생년월일 : " + birthday);

	}

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);

		  

		  while (true) {

		   System.out.print("이름을 입력하세요 : ");

		   String name = sc.nextLine();

		   System.out.print("전화번호를 입력하세요 : ");

		   String phoneNumber = sc.nextLine();

		   System.out.print("생년월일을 입력하세요 : ");

		   String birthday  = sc.nextLine();

		   

		   PhoneInfor p = new PhoneInfor(name, phoneNumber, birthday);

		   p.show();

		  }

		   

		 }

		}