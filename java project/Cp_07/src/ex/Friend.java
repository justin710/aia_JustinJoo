package ex;

public class Friend {

	
		String myName;
		
		Friend(String name){
			myName = name;
		
		}
		
		
		// ocject 클래스의 toString() 매서드를 재 구성한다 -> 오버라이딩
		// 매서드의 선언부가 원본 메서드의 선언부와 동일해야 한다.
		
		/*
		 * public String toString(){ return "제 이름은 "+myName+"입니다."; }
		 */

		@Override
		public String toString() {
			return "Friend [myName=" + myName + "]";
		}

		
		
		
		public static void main(String[] args) {

			Friend f1 = new Friend("손흥민");
			Friend f2 = new Friend("박지성");
	
			System.out.println(f1.toString());
			System.out.println(f1);
			
			System.out.println(f2.toString());
			System.out.println(f2);
		}

}
