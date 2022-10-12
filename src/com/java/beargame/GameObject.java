package com.java.beargame;

public abstract class GameObject {
	protected int distance; // �ѹ��̵��Ÿ�
	protected int x, y; // ������ġ
	
	public GameObject(int startX, int startY, int distance)	 {//�ʱ� ��ġ�� �̵� �Ÿ� ����
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
	
	public void setX(int x) { // ��ǥ�� ������ �߰��� ���� x,y setter ����
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public boolean collide(GameObject p) { // �浹������ true ����
		if(this.x == p.getX() && this.y == p.getY()) {
			return true;
		} else {
			return false;
		}
	}
	
	protected abstract void move(int inputX, int inputY); // �̵� ���� ���ο� ��ġ�� x, y ����
	protected abstract char getShape(); // ��ü�� ����� ��Ÿ���� ���� ����
}
