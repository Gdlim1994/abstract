package com.java.beargame;

import java.util.Random;

class Fish extends GameObject {
	Random rand = new Random();
	int randomMove;
	int cnt = 1;
	
	public Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}
	
	protected void move(int x, int y) {
		if(cnt < 4) { // fish�� 3�� �̵�����
			cnt++;
			return;
		} else { // 2�� ���� ��ĭ �̵�
			randomMove = rand.nextInt(4);
			switch(randomMove) {
			case 0 :
				setX(getX() + 1);
				break;
			case 1 :
				setX(getX() - 1);
				break;
			case 2 :
				setY(getY() + 1);
				break;
			case 3 :
				setY(getY() - 1);
			}
			if(cnt == 5) { // 2�� �̵��ϸ� cnt�� �ٽ� ó���� 1�� �ʱ�ȭ.
				cnt = 1;
				return;
			}
			cnt++;
		}
	}
	
	protected char getShape() {
		return '@';
	}
	
}
