package com.test.main;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		// 동물원 객체를 생성한다.
		Factory factory = new Factory(scanner);
		
		// 입력받은 동물의 타입 번호
		int typeCar = 0;
		
		do {
			System.out.println("어떤 자동차를 생산할까요?");
			System.out.print("1. SUV, 2. 세단, 3. 슈퍼카, 0. 종료 : ");
			typeCar = scanner.nextInt();
			
			if(typeCar != 0) {
			
				System.out.print("자동차의 이름은 무엇인가요? : ");
				String name = scanner.next();
				Car car = null;
				
				switch(typeCar) {
				case 1 :
					car = new Car() {

						@Override
						public void howStart() {
							// TODO Auto-generated method stub
							System.out.println("시동방법 : 버튼을 눌러 시동을 건다.");
						}
						
					};
					car.type = "SUV";
					car.name = name;
					car.price = "싸다";
					car.color = "빨간색";
					break;
				case 2 :
					car = new Car() {

						@Override
						public void howStart() {
							// TODO Auto-generated method stub
							System.out.println("시동방법 : 카드를 올려 시동을 건다.");
						}
						
					};
					car.type = "세단";
					car.name = name;
					car.price = "보통이다";
					car.color = "검은색";
					break;
				case 3 :
					car = new Car() {

						@Override
						public void howStart() {
							// TODO Auto-generated method stub
							System.out.println("시동방법 : 지문 인식으로 시동을 건다.");
						}
						
					};
					car.type = "슈퍼카";
					car.name = name;
					car.price = "비싸다";
					car.color = "노란색";
					break;
				}
			
				factory.addCar(car);
			}
		} while(typeCar != 0);
		
		factory.printCarInfo();
		
		
		scanner.close();
	}

	
	
}