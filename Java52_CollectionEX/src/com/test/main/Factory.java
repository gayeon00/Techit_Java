package com.test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Factory {
	// 스캐너
	private Scanner scanner;
	// 자동차들을 담을 배열
	private ArrayList<Car> carList;
	
	public Factory() {
		this.scanner = new Scanner(System.in);
		carList = new ArrayList<Car>();
	}
	
	// 자동자 타입 입력 메서드
	public int inputCarType() {
		System.out.println("자동차 종류를 입력해주세요");
		System.out.print("1.SUV, 2.세단, 3.슈퍼카, 0.종료 : ");
		int carType = scanner.nextInt();
		return carType;
	}
	
	// 자동자 이름을 받아 자동차 객체를 생성하는 메서드
	public void inputCarInfo(int carType) {
		System.out.print("자동차 이름을 입력해주세요 : ");
		String name = scanner.next();
		
		// 자동차 종류에 따라 객체를 생성한다.
		Car car = null;
		
		switch (carType) {
		case 1 :
//			car = new Car() {
//				@Override
//				public void startEngine() {
//					// TODO Auto-generated method stub
//					System.out.println("버튼을 눌러 시동을 겁니다.");
//				}
//			};
//			car.setCarType("SUV");
//			car.setCarName(name);
//			car.setCarPrice("싸다");
//			car.setCarColor("빨간색");
			car = new SUVClass("SUV", name, "싸다", "빨간색");
			break;
		case 2 :
//			car = new Car() {
//				@Override
//				public void startEngine() {
//					// TODO Auto-generated method stub
//					System.out.println("카드를 올려둡니다.");
//				}
//			};
//			car.setCarType("세단");
//			car.setCarName(name);
//			car.setCarPrice("보통이다");
//			car.setCarColor("검정색");
			car = new SedanClass("세단", name, "보통이다", "검정색");
			break;
		case 3 :
//			car = new Car() {
//				public void startEngine() {
//					System.out.println("지문 인식으로 시동을 겁니다.");
//				};
//			};
//			car.setCarType("슈퍼카");
//			car.setCarName(name);
//			car.setCarPrice("비싸다");
//			car.setCarColor("노란색");
			car = new SuperCarClass("슈퍼카", name, "비싸다", "노란색");
			break;
		}
		
		carList.add(car);
	}

	// 자동차 정보들을 출력하는 메서드
	public void printCarInfo() {
		for(Car car: carList) {
			car.printCarInfo();
		}
	}
}

//abstract class Car{
//	// 자동차 종류
//	private String carType;
//	// 자동차 이름
//	private String carName;
//	// 자동차 가격
//	private String carPrice;
//	// 자동차 색상
//	private String carColor;
//	
//	public abstract void startEngine();
//
//	public void setCarType(String carType) {
//		this.carType = carType;
//	}
//
//	public void setCarName(String carName) {
//		this.carName = carName;
//	}
//
//	public void setCarPrice(String carPrice) {
//		this.carPrice = carPrice;
//	}
//
//	public void setCarColor(String carColor) {
//		this.carColor = carColor;
//	}
//	
//	// 자동차의 정보를 출력하는 메서드
//	public void printCarInfo() {
//		System.out.printf("자동차 종류 : %s\n", carType);
//		System.out.printf("자동차 이름 : %s\n", carName);
//		System.out.printf("자동차 가격 : %s\n", carPrice);
//		System.out.printf("자동차 색상 : %s\n", carColor);
//		startEngine();
//	}
//	
//}

abstract class Car{
	private String carType;
	// 자동차 이름
	private String carName;
	// 자동차 가격
	private String carPrice;
	// 자동차 색상
	private String carColor;
	
	public Car(String carType, String carName, String carPrice, String carColor) {
		this.carType = carType;
		this.carName = carName;
		this.carPrice = carPrice;
		this.carColor = carColor;
	}
	
	public abstract void startEngine();
	
	// 자동차의 정보를 출력하는 메서드
	public void printCarInfo() {
		System.out.printf("자동차 종류 : %s\n", carType);
		System.out.printf("자동차 이름 : %s\n", carName);
		System.out.printf("자동차 가격 : %s\n", carPrice);
		System.out.printf("자동차 색상 : %s\n", carColor);
		startEngine();
	}
}

// SUV
class SUVClass extends Car{

	public SUVClass(String carType, String carName, String carPrice, String carColor) {
		super(carType, carName, carPrice, carColor);
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("버튼을 눌러 시동을 겁니다.");
	}
}

// 세단
class SedanClass extends Car{

	public SedanClass(String carType, String carName, String carPrice, String carColor) {
		super(carType, carName, carPrice, carColor);
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("카드를 올려둡니다.");
	}
}

//슈퍼카
class SuperCarClass extends Car{

	public SuperCarClass(String carType, String carName, String carPrice, String carColor) {
		super(carType, carName, carPrice, carColor);
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("지문 인식으로 시동을 겁니다.");
	}
}




