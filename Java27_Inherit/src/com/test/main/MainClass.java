package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 상속
		// 다른 클래스의 멤버 변수나 멤버 메서드를 자기 것 처럼
		// 물려받아 사용하는 개념
		// 상속을 받는 쪽을 자식 클래스(Sub Class)라고 부르고
		// 상속해 주는 쪽을 부모 클래스(Super Class)라고 부른다.
		// 자바의 모든 클래스는 제한을 두지 않으면 부모 클래스가 될 수 있다.
		// 자식 클래스의 객체를 생성하면 부모 클래스의 객체도 같이 생성되며
		// 부모 클래스의 요소를 자기 것인 것 처럼 사용할 수 있다.
		
		SubClass sub1 = new SubClass();
		sub1.subMethod();
		
		SubClass2 sub2 = new SubClass2();
		System.out.printf("sub2 : %s\n", sub2);
		
		SubClass2 sub3 = new SubClass2(100);
		System.out.printf("sub3 : %s\n", sub3);
	}
}

// 부모 클래스
class SuperClass{
	int memberC = 300;
	int memberD = 400;
	
	public void superMethod() {
		System.out.println("SuperClass의 superMethod 호출");
	}
}

// SuperClass를 상속 받는다.
class SubClass extends SuperClass{
	
	int memberA = 100;
	int memberB = 200;
	
	public void subMethod() {
		System.out.printf("memberA : %d\n", memberA);
		System.out.printf("memberB : %d\n", memberB);
		System.out.printf("memberC : %d\n", memberC);
		System.out.printf("memberD : %d\n", memberD);
		subMethod2();
		superMethod();
	}
	
	public void subMethod2() {
		System.out.println("SubClass의 subMethod2 호출");
	}
}

// 상속에서의 생성자
// 클래스의 객체를 생성하면 생성자가 자동으로 호출된다.
// 이 때, 생성자에서 부모 클래스의 생성자를 자동으로 호출해주며
// 자동으로 호출되는 생성자는 매개변수가 없는 생성자이다.
class SuperClass2{
	
	public SuperClass2() {
		System.out.println("SuperClass2의 기본 생성자");
	}
	
	public SuperClass2(int a1) {
		System.out.printf("SuperClass2의 매개변수 하나 있는 생성자 : %d\n", a1);
	}
}

class SubClass2 extends SuperClass2{
	public SubClass2() {
		System.out.println("SubClass2의 기본 생성자");
	}
	
	// 만약 매개변수가 있는 생성자를 선택해 객체를 생성한다고 하더라도
	// 부모의 생성자 호출을 명시하지 않으면 부모의 생성자 중 매개변수가 없는
	// 기본 생성자가 호출된다.
	// 만약 부모의 생성자를 선택하고 싶다면 super를 사용한다.
	public SubClass2(int a1) {
		// 부모의 생성자를 명시적으로 지정한다.
		super(a1);
		System.out.printf("SubClass2의 매개변수 하나 있는 생성자 : %d\n", a1);
	}
}







