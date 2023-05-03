package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// final
		// 더이상 변경할 수 없다는 의미를 가지고 있다.
		// 변수 : 변수에 다른 값을 저장할 수 없다.
		// 메서드 : 자식 클래스에서 overriding이 불가능하다
		// 클래스 : 상속이 불가능하다.F
		TestClass1 t1 = new TestClass1();
		System.out.printf("t1.FINAL_VALUE : %d\n", t1.FINAL_VALUE);

		// final 변수에 값 저장 -> 안됨!
		t1.FINAL_VALUE = 200;
	}

}

class TestClass1 {
	// final 변수
	// final 변수는 변수를 선언한 이후에 값을 저장할 수 없다.
	// 이에, 변수를 선언할 때 값을 저장해줘야 한다.
	// 상수 역할을 할 변수를 정의할 때 사용한다.
	final int FINAL_VALUE = 100;
}

class SuperClass1 {

	public final void method1() {
		System.out.println("SuperClass1의 method1");
	}
}

class SubClass1 extends SuperClass1 {
	// SuperClass1의 final 메서드 overriding -> final함수라 안됨!!
	public void method1() {
		System.out.println("SubClass1의 method1");
	}
}

final class Super2 {

}

//부모가 final이라 상속 안됨!!
class Sub2 extends Super2 {

}