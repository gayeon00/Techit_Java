package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 생성자
		// 클래스를 통해 객체를 생성할 때 무조건 동작하는 요소
		// 생성자는 반환 타입이 없고 클래스 이름과 동일하게 작성해준다.
		// 클래스를 통해 객체를 생성할 때는 반드시 생성자를 지정해야한다.
		TestClass1 t1 = new TestClass1();
		System.out.printf("t1 : %s\n", t1);
		
		TestClass2 t2 = new TestClass2();
		System.out.printf("t2 : %s\n", t2);
		
		TestClass3 t3 = new TestClass3(100, 200);
		System.out.printf("t3 : %s\n", t3);
		
		StudentClass s1 = new StudentClass("홍길동", 1, 100, 90, 80);
		s1.printStudentInfo();
	}
}

// 생성자가 없는 클래스
// 클래스를 만들 때 생성자를 작성하지 않으면 기본 생성자가 자동으로 추가된다.
// 기본 생성자 : 클래스이름(){ }
class TestClass1{
	
}

// 매개 변수가 없는 생성자를 가지는 클래스
class TestClass2{
	// 생성자
	public TestClass2() {
		System.out.println("TestClass2의 생성자");
	}
}

// 매개 변수가 있는 생성자를 가지는 클래스
class TestClass3 {
	// 생성자
	public TestClass3(int a1, int a2) {
		System.out.println("TestClass3의 생성자");
		System.out.printf("a1 : %d\n", a1);
		System.out.printf("a2 : %d\n", a2);
	}
}

// 학생클래스
class StudentClass{
	String name;
	int grade;
	int korean;
	int english;
	int math;
	
	public StudentClass(String name, int grade, int korean, int english, int math) {
		// this : 객체의 멤버에 접근할 때 사용한다.
		this.name = name;
		this.grade = grade;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	public void printStudentInfo() {
		System.out.printf("이름 : %s\n", name);
		System.out.printf("학년 : %d\n", grade);
		System.out.printf("국어 : %d\n", korean);
		System.out.printf("영어 : %d\n", english);
		System.out.printf("수학 : %d\n", math);
	}
}
















