package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다형성 : 형태가 다양하다라는 뜻.
		// 객체 지향에서 다형성의 의미는 생성된 객체의 형태가
		// 다양하다는 의미로 사용한다.
		
		TestClass1 t1 = new TestClass1();
		// TestClass1을 통해 만든 객체를 TestClass2 타입의 변수에 담는다.
		// 객체를 생성했을 때 사용했던 클래스 타입의 변수에
		// 객체의 ID를 담을 수 있다.
		// 따라서 다른 클래스 타입의 변수에 객체의 ID를 담는건 오류이다.
		// TestClass2 t2 = t1;
		
		// 생성된 객체의 ID를 부모 클래스형 변수에 담는 것은 가능하다.
		TestClass4 t4 = new TestClass4();
		TestClass3 t3 = t4;
		System.out.printf("t4 : %s\n", t4);
		System.out.printf("t3 : %s\n", t3);
		
		// 객체를 생성했을 때 사용했던 클래스 타입의 변수를 이용해 멤버 사용
		// 부모의 것도 모두 사용가능하다.
		System.out.printf("t4.memberA : %d\n", t4.memberA);
		System.out.printf("t4.memberB : %d\n", t4.memberB);
		System.out.printf("t4.memberC : %d\n", t4.memberC);
		System.out.printf("t4.memberD : %d\n", t4.memberD);
		
		// 부모 클래스 타입의 변수를 이용해 멤버 사용
		System.out.printf("t3.memberA : %d\n", t3.memberA);
		System.out.printf("t3.memberB : %d\n", t3.memberB);
		// TestClass4를 가지고 객체를 생성했다고 하더라도 변수가 부모 클래스 
		// 타입의 변수이기 때문에 부모 클래스 영역만 접근할 수 있다.
		// System.out.printf("t3.memberC : %d\n", t3.memberC);
		// System.out.printf("t3.memberD : %d\n", t3.memberD);
		
	}
}

class TestClass1{
	
}

class TestClass2{
	
}

class TestClass3{
	int memberA = 100;
	int memberB = 200;
}

class TestClass4 extends TestClass3{
	int memberC = 300;
	int memberD = 400;
}





