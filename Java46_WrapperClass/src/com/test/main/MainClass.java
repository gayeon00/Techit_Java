package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Wrapper 클래스 : 기본 자료형 값을 관리하기 위한 목적

		// 자료형에 대한 정보를 파악한다.
		System.out.printf("Byte : %d\n", Integer.BYTES);
		System.out.printf("비트수 : %d\n", Integer.SIZE);
		System.out.printf("최대값 : %d\n", Integer.MAX_VALUE);
		System.out.printf("최소값 : %d\n", Integer.MIN_VALUE);

		// 기본 자료형 값을 객체로 포장하는 용도로 사용한다.
		Integer a1 = new Integer(100);
		int a2 = a1.intValue();
		System.out.printf("a1 : %s\n", a1);
		System.out.printf("a2 : %d\n", a2);

		/* Boxing */
		// 기본 자료형 값을 Wrapper 클래스 타입으로 만들어준다.
		// 정수 100을 관리하는 Integer 타입 객체를 생성하고 객체의 id를
		// a3 변수에 담아준다.
		Integer a3 = 100;

		/* UnBoxing */
		// Wrapper객체에 담긴 값을 추출하여 기본 자료형 값에 담아준다.
		int a4 = a3;
		System.out.printf("a3 : %d\n", a3);
		System.out.printf("a4 : %d\n", a4);

	}

	public static int add(Integer a1, Integer a2) {
		return a1 + a2;
	}

}
