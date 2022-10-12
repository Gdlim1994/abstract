package abstractClass;

public abstract class AbstractC { 
	//abstract 추상클래스 public 앞에 붙이는게 일번적 문법
	//1. abstract 제한을 붙여서 클래스를 선언한다.
	//2. 일반클래스와 동일하게 멤버를 정의한다.
	//3. 추상메소드를 정의한다.
	//4. 생성이 불가하다.
	//5. 반드시 자식 클래스에 상속해야 된다.(상속을 위한 클래스)
	//6. 자식클래스는 반드시 추상 메소드를 오버라이딩 해야한다.
	
	int x;
	
	AbstractC(){
		
	}

	void method() {
		
	}
	
	abstract void abstractMethod(); //추상메소드는 선언만 하고 정의하지 않는다. // 추상클래스 안에서만 존재한다.
}
