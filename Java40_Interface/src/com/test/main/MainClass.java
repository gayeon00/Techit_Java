package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Interface */
		// 추상 메서드만 가지고 있는 요소
		// 자바에서 클래스는 하나의 클래스만 상속 받을 수 있다.
		// but 하나의 클래스는 다수의 Interface를 구현할 수 있다.

		// 인터페이스에 정의한 변수 사용
		System.out.printf("TestInterface1.a1 : %d\n", TestInterface1.a1);

		TestClass1 t1 = new TestClass1();
		t1.testMethod1();
		t1.testMethod2();

		// 인터페이스에도 담을 수 있음
		TestInterface1 t10 = new TestClass1();
		t10.testMethod1();

		TestInterface2 t20 = new TestClass1();
		t20.testMethod2();

		// 1,2,3을 모두 구현한 클래스 하나Test200를 만들면 그 클래스 객체는
		// 여기 있는 모든 메서드에 매개변수로 들어갈 수 있음
		// 1,2,3이 클래스였다면 클래스1'2'3' 3개 만들고 객체 각각 만들어야함
		// ex) printf("",객체) -> 여기 객체 아무거나 다 들어올수 잇음!
		Test100 t100 = new Test100();
		Test200 t200 = new Test200();
		t100.testMethod1(t200);
		t100.testMethod2(t200);
		t100.testMethod3(t200);

		// 인터페이스에 static 메서드 정의할 수 있다! -> 인터페이스도 컴파일 타임에 만들어지니까!
		TestInterface1.testMethod100();
		
		// default 메서드는 static이 아니므로 인터페이스 이름을 통해 
        // 호출이 불가능하다.
        // Inter500.defaultMethod();
		
        // Inter500을 구현한 클래스의 객체를 생성한다.
        Test500 t500 = new Test500();
        // Inter500에 있는 default 메서드 호출
        t500.defaultMethod();
	}

}

interface TestInterface1 {
	// 인터페이스에 정의한 변수는 static final 변수이다.
	// static final이어야 얘를 imple한 클래스가 객체를 생성할 수 있음
	int a1 = 100;

	/* 메서드 */
	// 인터페이스에 정의한 메서드는 추상 메서드이다.
	public void testMethod1();

	// 인터페이스에 static 메서드 정의할 수 있다! -> 인터페이스도 컴파일 타임에 만들어지니까!
	public static void testMethod100() {
		System.out.println("testMethod100");
	}
}

interface TestInterface2 {
	public void testMethod2();
}

//인터페이스를 구현한 클래스
//여러 개의인터페이스를 구현할 수 있다.
class TestClass1 implements TestInterface1, TestInterface2 {

	@Override
	public void testMethod1() {
		// TODO Auto-generated method stub
		System.out.println("TestClass1의 testMethod1");
		System.out.printf("a1 : %d\n", a1);
	}

	@Override
	public void testMethod2() {
		// TODO Auto-generated method stub
		System.out.println("TestClass1의 testMethod2");
	}

}

interface Inter1 {
	public void inter1Method();
}

interface Inter2 {
	public void inter2Method();
}

interface Inter3 {
	public void inter3Method();
}

//1,2,3을 모두 구현한 클래스 하나를 만들면 여기 있는 모든 메서드에 매개변수로 들어갈 수 있음
class Test100 {
	public void testMethod1(Inter1 inter1) {
		inter1.inter1Method();
	}

	public void testMethod2(Inter2 inter2) {
		inter2.inter2Method();
	}

	public void testMethod3(Inter3 inter3) {
		inter3.inter3Method();
	}
}

class Test200 implements Inter1, Inter2, Inter3 {

	@Override
	public void inter3Method() {
		// TODO Auto-generated method stub
		System.out.println("TestClass200의 inter3Method");
	}

	@Override
	public void inter2Method() {
		// TODO Auto-generated method stub
		System.out.println("TestClass200의 inter2Method");
	}

	@Override
	public void inter1Method() {
		// TODO Auto-generated method stub
		System.out.println("TestClass200의 inter1Method");
	}

}

//인터페이스의 인터페이스 상속 -> 다중상속 아님! 클래스 끼리만 "상속"이라고 말함
//자주 구현해야 하는 인터페이스들이 많을 경우 
//하나의 인터페이스에 모두 상속 시키고
//상속 받은 인터페이스 하나만 클래스에 구현하면 편하게 사용할 수 있다.
interface Inter4 extends Inter1, Inter2, Inter3 {
	public void inter4Method();
}

class TestClass400 implements Inter4{

	@Override
	public void inter1Method() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inter2Method() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inter3Method() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inter4Method() {
		// TODO Auto-generated method stub
		
	}
	
}

//default  메서드
//Java 버전에 따라서 안될 수도 있다.
//Java 8 부터 가능...
//인터페이스에 있는 default 메서드는 클래스에 있는 메서드와 동일하게 동작한다.
//static이 아니기 때문에 인터페이스를 구현한 클래스의 객체를 통해 이 메서드를 호출할 수 있다.
//메서드만 default로 정의할 수 있기 때문에 변수에 대해 default 메서드처럼 작업할 수 없다.
interface Inter500{
	public default void defaultMethod() {
		System.out.println("defaultMethod");
	}
}

//Inter500을 구현한 클래스
class Test500 implements Inter500{
	
}