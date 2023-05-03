package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// static
		// 객체를 생성하지 않고도 사용하는 요소로써 클래스 이름을 통해 접근할
		// 수 있다.
		// 변수 : 프로그램이 시작되어 클래스들이 메모리에 올라갈 때 생성되는 변수
		// 객체 참조 변수를 통해서도 사용이 가능하며 딱 하나의 변수만 생성된다.
		// 프로그램 전체에서 딱 하나만 존재하는 값을 저장할 때 사용한다.
		// 메서드 : static 변수나, 매개변수를 포함한 지역변수만 사용이 가능하다.
		// static변수나 매개변수를 포함한 지역변수만 사용하는 메서드의 경우 static
		// 으로 정의하면 편하게 사용할 수 있다.
		// static 요소 사용
		System.out.printf("TestClass1.memberB : %d\n", TestClass1.memberB);
		// 객체 생성없이 멤버함수 사용!!!!
		TestClass1.method2();

		// 객체 생성없이 멤버변수 사용 - 불가! static이아니니까
		// static이 아닌 멤버 들은 객체를 생성해야지만 사용할 수 있기 때문에
		// static 처럼 클래스 이름으로 접근하는 것은 불가능 하다.
		System.out.printf("TestClass1.memberA : %d\n", TestClass1.memberA);
		TestClass1.method1();

		TestClass1 t1 = new TestClass1();
		System.out.printf("t1.memberA : %d\n", t1.memberA);
		t1.method1();
		// 객체 참조 변수를 통해 static 요소에 접근한다.
		System.out.printf("t1.memberB : %d\n", t1.memberB);
		t1.method2();

	}

}

class TestClass1 {
	// 멤버 변수
	int memberA = 100;
	// static 변수
	// 프로그램 전체에서 딱 하나만 존재하는 변수
	static int memberB = 200;

	// 멤버 메서드
	public void method1() {
		System.out.println("method1 호출");
		// 객체를 생성해야지만 사용할 수 있는 메서드 이므로
		// 모든 static 요소에 접근할 수 있다.
		System.out.printf("memberA : %d\n", memberA);
		System.out.printf("memberB : %d\n", memberB);
		method2();
	}

	// static 메서드
	public static void method2() {
		System.out.println("method2 호출");
		// static 메서드는 객체를 생성하지 않아도 호출이 가능하기 때문에
        // 객체의 멤버에는 접근이 불가능하다.
        System.out.printf("memberA : %d\n", memberA);
        System.out.printf("memberB : %d\n", memberB);
        method1();
	}
}
