package com.test.zoo;

public class AnimalClass {
	// 다리 개수
	int numberLegs;
	// 코의 길이
	String lengthNose;
	// 몸의 크기
	String bodySize;
	// 이름
	String name;
	// 동물 타입
	String type;
	
	// 식사 방법
	public void howEat() {
		
	}
	
	// 출력
	public void printInfo() {
		System.out.printf("동물 타입 : %s\n", type);
		System.out.printf("이름 : %s\n", name);
		System.out.printf("다리 개수 : %d\n", numberLegs);
		System.out.printf("코의 길이 : %s\n", lengthNose);
		System.out.printf("몸의 크기 : %s\n", bodySize);
	}
}
















