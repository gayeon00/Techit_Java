package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Overloading
		// 메서드나 생성자를 작성할 때 매개변수의 형태를 다르게 하여
		// 같은 이름으로 여러개를 만들 수 있도록 제공되는 개념
		
		TestClass1 t1 = new TestClass1();
		TestClass1 t2 = new TestClass1(1);
		TestClass1 t3 = new TestClass1(1, 2);
		
		t1.printMember();
		t2.printMember();
		t3.printMember();
		
		int r1 = t1.add(100, 200);
		long r2 = t1.add(100L, 200L);
		double r3 = t1.add(11.11, 22.22);
		
		System.out.printf("r1 : %d\n", r1);
		System.out.printf("r2 : %d\n", r2);
		System.out.printf("r3 : %f\n", r3);
		
		int r4 = t1.add2(10, 20, 30);
		int r5 = t1.add2(10, 20, 30, 40, 50);
		int r6 = t1.add2(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
		System.out.printf("r4 : %d\n", r4);
		System.out.printf("r5 : %d\n", r5);
		System.out.printf("r6 : %d\n", r6);
	}
}

class TestClass1{
	int memberA;
	int memberB;
	
	// 생성자 Overloading
	// 생성자에서 다른 생성자를 호출할 때는 this()를 사용한다
	// 생성자 내에서 첫 번째 코드여야 한다.
	public TestClass1() {
		this(100, 200);
		// this.memberA = 100;
		// this.memberB = 200;
	}
	
	public TestClass1(int memberA) {
		this(memberA, 200);
		// this.memberA = memberA;
		// this.memberB = 200;
	}
	
	public TestClass1(int memberA, int memberB) {
		this.memberA = memberA;
		this.memberB = memberB;
	}
	
	public void printMember() {
		System.out.printf("memberA : %d\n", memberA);
		System.out.printf("memberB : %d\n", memberB);
	}
	
	// 메서드도 이름을 동일하게 하고 매개변수의 형태를 다르게 하여 
	// 메서드를 여러개 만들 수 있다.
	public int add(int a1, int a2) {
		return a1 + a2;
	}
	
	public long add(long a1, long a2) {
		return a1 + a2;
	}
	
	public double add(double a1, double a2) {
		return a1 + a2;
	}
	
	// 가변형 매개변수.
	// 타입이 같은 매개변수를 가지고 있는 메서드를 무한정 만들수 없기 때문에
	// 제공되는 개념
	// 매개 변수를 작성할 때 ... 을 붙혀주면 전달 되는 값들을 배열로 만들어 
	// 사용할 수 있다.
	public int add2(int ... a1) {
		int total = 0;
		
		for(int value : a1) {
			total = total + value;
		}
		
		return total;
	}
}









