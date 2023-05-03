package com.test.main;

import java.util.Scanner;

//공장 클래스 
//Factory 
public class Factory {

	Scanner scanner;

	// 동물객체들을 담을 배열
	Car[] carArray;
	int carCount = 0;

	public Factory(Scanner scanner) {
		this.scanner = scanner;
		carArray = new Car[1000];
		carCount = 0;
	}

	// 동물을 추가하는 메서드
	public void addCar(Car car) {
		carArray[carCount] = car;
		carCount++;
	}

	public void printCarInfo() {
		// 동물의 수만큼 반복
		for (int i = 0; i < carCount; i++) {
			// for(Car car : carArray ) 실행시 1000번 루프한다.
			Car car = carArray[i];
			car.printInfo();
			car.howStart();
			System.out.println();
		}
	}

}

//차 클래스 
//Car 

abstract class Car {
	String type; //타입
	String name; // 자동차 이름
	String price; // 가격
	String color; // 색상

	abstract public void howStart(); // 시동방법
	
	public void printInfo() {
		System.out.printf("자동차 종류 : %s\n", type);
		System.out.printf("이름 : %s\n", name);
		System.out.printf("가격 : %s\n", price);
		System.out.printf("색상 : %s\n", color);
	}
}