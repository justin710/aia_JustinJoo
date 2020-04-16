package card;

public class CardMain2 {

	public static void main(String[] args) {
		
	

		
		for(int k=0; k<4; k++) {
			for(int n=1; n<14; n++  ) {
				
				String kind = "";
				
				switch(k){
					case 0:
						kind="Spade";
						break;
					case 1:
						kind="Clover";
						break;
					case 2:
						kind="Heart";
						break;
					case 3:
						kind="Diamond";
						break;
				
			
			
		}
				Card.height=125;
				Card.width=50;
				
				System.out.println("사이즈"+Card.height+ "이고"+Card.width+ "인 카드 -"+(kind)+n);
		
			}
			
		}
	}
}

		
			
			
	
	


