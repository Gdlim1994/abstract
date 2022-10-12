package com.java.beargame;

import java.util.Random;

class Bear extends GameObject {
	
	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	protected void move(int inputX, int inputY) {
		if(!(getX() == 0 && inputX == -1)) { //bear가 맵 밖으로 나가려고할때 제외
			this.x += inputX; 
		}
		if(!(getY() == 0 && inputY == -1)) {
			this.y += inputY;
		}
	}
	
	protected char getShape() {
		return 'B';
	}
	
}
