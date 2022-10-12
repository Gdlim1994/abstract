package com.java.starcraft;

public class Marine extends GroundUnit implements Cureable {

	Marine(int hp) {
		super(hp);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		
		return "Marine";
		
	}

}
