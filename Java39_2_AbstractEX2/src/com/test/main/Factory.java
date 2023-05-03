package com.test.main;

import java.util.Scanner;

public class Factory {

	private final int CAR_MAX_COUNT = 100;
	// private이라 외부에서 접근 X
	private Scanner scanner;
	// 동물객체들을 담을 배열
	private Car[] carArray;
	// 동물의 수
	private int carCount = 0;

	public Factory() {
		this.scanner = new Scanner(System.in);
		carArray = new Car[CAR_MAX_COUNT];
	}

	// 입력한 동물들의 정보를 출력하는 메서드
	public void printCarInfo() {
		// 동물의 수 만큼 반복한다.
		for (int i = 0; i < carCount; i++) {
			carArray[i].carInfo();
			System.out.println();
		}
	}

	public int inputCarType() {
		// 동물 타입 번호를 입력받는다.
		System.out.println("어떤 자동차를 생산할까요?");
		System.out.print("1. SUV, 2. 세단, 3. 슈퍼카, 0. 종료 : ");
		return scanner.nextInt();
	}

	// 자동자 이름을 받아 자동차 객체를 생성하는 메서드
	public void inputCarInfo(int carType) {
		// 동물의 이름을 입력받는다.
		System.out.print("자동차의 이름은 무엇인가요? : ");
		String name = scanner.next();

		// 동물 객체를 생성한다.
		Car car = null;

		switch (carType) {
		case 1:
//			car = new Car() {
//
//				@Override
//				public void howStart() {
//					// TODO Auto-generated method stub
//					System.out.println("시동방법 : 버튼을 눌러 시동을 건다.");
//				}
//
//			};
//			car.setType("SUV");
//			car.setName(name);
//			car.setPrice("싸다");
//			car.setColor("빨간색");

			car = new SUVClass("SUV", name, "싸다", "빨간색");
			break;
		case 2:
//			car = new Car() {
//
//				@Override
//				public void howStart() {
//					// TODO Auto-generated method stub
//					System.out.println("시동방법 : 카드를 올려 시동을 건다.");
//				}
//
//			};
//			car.setType("세단");
//			car.setName(name);
//			car.setPrice("보통이다");
//			car.setColor("검은색");
			car = new SedanClass("세단", name, "보통이다", "검은색");
			break;
		case 3:
//			car = new Car() {
//
//				@Override
//				public void howStart() {
//					// TODO Auto-generated method stub
//					System.out.println("시동방법 : 지문 인식으로 시동을 건다.");
//				}
//
//			};
//			car.setType("슈퍼카");
//			car.setName(name);
//			car.setPrice("비싸다");
//			car.setColor("노란색");
			car = new SuperClass("슈퍼카",name,"비싸다","노란색");
			break;
		}
		carArray[carCount] = car;
		carCount++;
	}

}

//abstract class Car {
//
//	private String type;
//	private String name;
//	private String price;
//	private String color;
//
//	public void setType(String type) {
//		this.type = type;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setPrice(String price) {
//		this.price = price;
//	}
//
//	public void setColor(String color) {
//		this.color = color;
//	}
//
//	public abstract void howStart();
//
//	public void carInfo() {
//		System.out.printf("자동차 종류 : %s\n", type);
//		System.out.printf("이름 : %s\n", name);
//		System.out.printf("가격 : %s\n", price);
//		System.out.printf("색상 : %s\n", color);
//		howStart();
//	}
//
//}

abstract class Car {
	private String type;
	private String name;
	private String price;
	private String color;

	public Car(String _type, String _name, String _price, String _color) {
		type = _type;
		name = _name;
		price = _price;
		color = _color;
	}
	
	public abstract void howStart();

	public void carInfo() {
		System.out.printf("자동차 종류 : %s\n", type);
		System.out.printf("이름 : %s\n", name);
		System.out.printf("가격 : %s\n", price);
		System.out.printf("색상 : %s\n", color);
		howStart();
	}
}

class SUVClass extends Car {

	public SUVClass(String _type, String _name, String _price, String _color) {
		super(_type, _name, _price, _color);
	}

	@Override
	public void howStart() {
		// TODO Auto-generated method stub
		System.out.println("시동방법 : 버튼을 눌러 시동을 건다.");
	}
	
}

class SedanClass extends Car {

	public SedanClass(String _type, String _name, String _price, String _color) {
		super(_type, _name, _price, _color);
	}

	@Override
	public void howStart() {
		// TODO Auto-generated method stub
		System.out.println("시동방법 : 카드를 올려 시동을 건다.");
	}
	
}

class SuperClass extends Car {

	public SuperClass(String _type, String _name, String _price, String _color) {
		super(_type, _name, _price, _color);
	}

	@Override
	public void howStart() {
		// TODO Auto-generated method stub
		System.out.println("시동방법 : 지문 인식으로 시동을 건다.");
	}
	
}

