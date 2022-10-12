package com.java.starcraft;

public class Dropship extends AirUnit implements Repairable{

	Dropship(int hp) {
		super(hp);
		hitPoint = MAX_HP;
	}
		
		@Override
		public String toString() {
			
			return "Dropship";
		
	}

}
