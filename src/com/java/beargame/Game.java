package com.java.beargame;

import java.util.Scanner;

public class Game {
	Scanner scan = new Scanner(System.in);
	char[][] map;
	Bear bear;
	Fish fish;
	int inputX = 0, inputY = 0;
	
	Game() {
		run();
	}

	void showMap(Bear bear, Fish fish) {
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				map[i][j] = '-';						   // ��ĭ�� '-' �� ä���.
				if(i == fish.getX() && j == fish.getY()) { // fish�� x,y��ǥ��
					map[i][j] = fish.getShape();		   // fish�� shape('@')�� �ִ´�.
				}
				if(i == bear.getX() && j == bear.getY()) { // ���������� bear��.
					map[i][j] = bear.getShape();		   // bear�� ���߿� �ִ� ������ 
				}										   // bear�� fish�� �������
				System.out.print(map[i][j]);			   // @���� B�� ȭ�鿡 ���⶧��
			}
			System.out.println();
		}
	}
	
	void convertInput(String choice) {
		while(true) {						// �Է¹��� �̵��� ���� x,y���� 1�����ش�.
			if(choice.equals("a")) {
				inputY = -1;
				return;
			} else if(choice.equals("s")) {
				inputX = 1;
				return;
			}else if(choice.equals("w")) {
				inputX = -1;
				return;
			} else if(choice.equals("d")) {
				inputY = 1;
				return;
			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				
			}
		}
	}
	
	void userControl(Bear bear, Fish fish) {
		System.out.print("����(a), �Ʒ�(s), ��(w), ������(d) >> ");
		convertInput(scan.next()); // �Է¹��� ���� �����̴°� int�� ��ȯ�ϰ�
		bear.move(inputX, inputY);
		fish.move(0, 0);
		System.out.print("Bear: (" + bear.getX() + ", " + bear.getY() + ") \t"); // ��ǥȮ��������
		System.out.println("Fish: (" + fish.getX() + ", " + fish.getY() + ")");  // �߰���
		
	}
	
	void run() {
		map = new char[10][20];

		bear = new Bear(0, 0, 1);
		fish = new Fish(5, 5, 1);

		System.out.println("** Bear�� Fish �Ա� ������ �����մϴ�.**");

		while (true) {
			showMap(bear, fish);
			if(bear.collide(fish)) { // �� ��ü�� �浹������ �޼��� ���� ����
				System.out.println("Bear Wins!!");
				break;
			}
			userControl(bear, fish);
		}
	}

	public static void main(String[] args) {
		new Game();
	}
}