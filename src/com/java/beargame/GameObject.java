package com.java.beargame;

public abstract class GameObject {
	protected int distance; // 한번이동거리
	protected int x, y; // 현재위치
	
	public GameObject(int startX, int startY, int distance)	 {//초기 위치와 이동 거리 설정
		this.x = startX;
		this.y = startY;
		this.distance = distance;
	}
	
	public int getX() { 
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) { // 좌표에 움직임 추가를 위해 x,y setter 생성
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public boolean collide(GameObject p) { // 충돌했을때 true 리턴
		if(this.x == p.getX() && this.y == p.getY()) {
			return true;
		} else {
			return false;
		}
	}
	
	protected abstract void move(int inputX, int inputY); // 이동 후의 새로운 위치로 x, y 변경
	protected abstract char getShape(); // 객체의 모양을 나타내는 문자 리턴
}
