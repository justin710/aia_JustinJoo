package tv;

public class Tv {
	
	// Tv의 속성(변수) -> 멤버 변수 , 인스턴스 변수
	
	String color; // Tv에 속성 값
	boolean power; // Tv의 전원상태(on/off)
	int channel; // Tv의 채널 값
	
	// 티비의 기능 -> 메서드 , 클래스의 멤버
	// 티비의 전원 켜고/끄는 기능
	
	void power() {
		power=!power;
		}
	

	// 채널을 올리는 
	void channelUp() {
		++channel;
	}
	// 채널을 내리는 
	void channelDown() {
		channel--;
	}
	// 채널값을 변경하는 : 채널값을 받아서 변경
	void channelChange(int ch) {
		channel=ch;
	}
	
}