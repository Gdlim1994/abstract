package com.java.starcraft;

public class Medic extends GroundUnit implements Cureable {

	Medic(int hp) {
		super(hp);
		hitPoint = MAX_HP;
	}
	void cure(Cureable c) { //Marine, SCV, Medic
		if(c instanceof Unit) {
			Unit u = (Unit)c;
			while(u.hitPoint != u.MAX_HP ) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 치료완료");
		}
	}
		
	
	@Override
	public String toString() {
		
		return "Medic";
	}
}
