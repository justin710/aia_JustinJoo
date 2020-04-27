package ex;

public abstract class Player {

	int currentPos;
	
	Player(){

	}

	abstract void play(int pos);
		
	
	abstract void stop();
	
	
	void play() {
		play(currentPos);
	}
}

	