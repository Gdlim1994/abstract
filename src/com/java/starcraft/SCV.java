package com.java.starcraft;

public class SCV extends GroundUnit implements Repairable, Cureable{

	SCV(int hp) {
		super(hp);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) { //scv,tank,dropship
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_HP) {
				 u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리완료");
		}
		
		
	}

	
	
	@Override
	public String toString() {
		
		return "SCV";
	
	}

	

}
