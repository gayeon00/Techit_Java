package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass sub1 = new SubClass();
		
		// SubClass를 가지고 객체를 만들어 SubClass형 변수에 담았기 때문에
		// 객체 전체(부모 포함)에 접근할 수 있다.
		System.out.printf("sub1.memberA : %d\n", sub1.memberA);
		System.out.printf("Sub1.memberB : %d\n", sub1.memberB);
		sub1.superMethod1();
		
		// SubClass를 가지고 만든 객체의 ID를 부모클래스 타입의 변수에 
		// 담았기 때문에 접근할 수 있는 영역은 부모의 영역으로 제한된다.
		SuperClass super1 = sub1;
		System.out.printf("super1.memberA : %d\n", super1.memberA);
		System.out.printf("Super1.memberB : %d\n", super1.memberB);
		super1.superMethod1();
		
		sub1.printSubClass();
	}
}

// 부모클래스
class SuperClass{
	int memberA = 100;
	int memberB = 200;
	
	public void superMethod1() {
		System.out.println("SuperClass의 superMethod1 입니다");
	}
	
}

// 자식클래스
class SubClass extends SuperClass{
	// 부모가 가지고 있는 변수와 동일한 이름의 변수를 선언한다.
	int memberA = 300;
	int memberB = 400;
	
	public void printSubClass() {
		System.out.printf("memberA : %d\n", memberA);
		System.out.printf("memberB : %d\n", memberB);
		// 부모클래스의 변수와 동일한 이름의 변수를 정의했을 경우
		// 자기 자신 것이 우선이며 부모 것을 사용하고 싶다면 super를 사용한다.
		System.out.printf("super.memberA : %d\n", super.memberA);
		System.out.printf("super.memberB : %d\n", super.memberB);
	}
	
	// 부모 클래스의 메서드를 overriding 한다.
	public void superMethod1() {
		System.out.println("SubClass의 superMethod1 입니다");
	}
}






