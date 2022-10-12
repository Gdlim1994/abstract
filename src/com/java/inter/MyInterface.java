package com.java.inter;

public interface MyInterface {
	//인터페이스
	//1. 생성이 불가하다.
	//2. 클래스처럼 멤버를 정희할 수 없다.
	//3. 두가지 형식의 멤버만 정의할 수 있다.(추상메소드, final 상수,디폴트 메소드 만 정의 가능)
	//4. 반드시 클래스에 상속해야한다.
	//5. 자식클래스는 추상메소드를 오버라이딩 해야한다.
	//6. 인터페이스간 상속도 가능하다.
	//7. 다중상속이 가능하다.
	//8. 클래스와 동일하게 다형성을 적용할 수 있다. // 인터페이스를 사용하는 주된 이유!!
	//9. 클래스와 인터페이스 간에 상속에는 extends 가 아닌 implements를 사용한다.
	
//	public static final int MAX = 100;  // public static final
//	public abstract void method(); // public abstract
	 int MAX = 100;
	 void method();

}
