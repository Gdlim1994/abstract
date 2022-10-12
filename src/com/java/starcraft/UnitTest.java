package com.java.starcraft;

public class UnitTest {

	public static void main(String[] args) {
		
		Tank t = new Tank(150);
		Dropship d = new Dropship(125);
		SCV scv = new SCV(60);
		Marine mr = new Marine(40);
 		Medic md  = new Medic(50);
		
        scv.repair(t);
        scv.repair(d);
        scv.repair(scv);
        md.cure(mr);
        md.cure(scv);
        md.cure(md);
       
	}

}
