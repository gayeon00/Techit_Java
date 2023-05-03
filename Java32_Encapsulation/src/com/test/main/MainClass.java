package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 캡슐화
		// 변수에 대한 직접 접근을 막음으로써 데이터의 무결성을
		// 보장할 수 있도록 개발하는 방식을 의미
		// 변수의 직접 접근을 막기 위해 private 접근 제한자를 붙혀준다.
		// 변수에 값을 저장하는 것을 객체 생성시 딱 한번만 허용하겠다면
		// 생성자를 통해 할 수 있도록 제공한다
		// 변수에 값을 저장하는 것을 원하는 만큼 할 수 있도록 하게 해주겠다면
		// setter를 만들어 제공한다.
		// 변수의 값을 가져다 사용할 수 있는 것을 할 수 있도록 하게 해주겠다면
		// getter를 만들어 제공한다.
		// setter의 이름짓는 규칙 : set변수명
		// getter의 이름짓는 규칙 : get변수명, is변수명(boolean)

		TestClass1 t1 = new TestClass1(200);
		t1.printValue();

		t1.setMemberC(300);
		System.out.printf("t1 memberC : %d\n", t1.getMemberC());

		t1.setMemberC(-300);
		System.out.printf("t1 memberC : %d\n", t1.getMemberC());

	}

}

class TestClass1 {
	// 변수들은 모두 private로 정의한다.
	private int memberA = 100;
	private int memberB;
	private int memberC;

	// 만약 변수의 값을 객체 생성시 딱 한번만 저장할 수 있도록 하겠다면
	// 생성자를 통해 처리한다.
	public TestClass1(int memberB) {
		this.memberB = memberB;
	}

	public void printValue() {
		System.out.printf("memberA : %d\n", memberA);
		System.out.printf("memberB : %d\n", memberB);
	}

	// memberC에 대한 setter
	public void setMemberC(int memberC) {
		// 값 저장에 대한 제한이 있다면 if로 구현
		if (memberC > 0)
			this.memberC = memberC;
	}

	// memberC에 대한 getter
	public int getMemberC() {
		return memberC;
	}

}

//setter getter 자동완성
//이클립스에서 Source > Generate Getters and Setters
class TestClass2 {
	private int memberA;
	private double memberB;
	private boolean memberC;
	private String memberD;
	
	public int getMemberA() {
		return memberA;
	}
	public void setMemberA(int memberA) {
		this.memberA = memberA;
	}
	public double getMemberB() {
		return memberB;
	}
	public void setMemberB(double memberB) {
		this.memberB = memberB;
	}
	public boolean isMemberC() {
		return memberC;
	}
	public void setMemberC(boolean memberC) {
		this.memberC = memberC;
	}
	public String getMemberD() {
		return memberD;
	}
	public void setMemberD(String memberD) {
		this.memberD = memberD;
	}

}
