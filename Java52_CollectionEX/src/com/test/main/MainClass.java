package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	     자동차 공장
//	        어떤 자동차를 생상할까요?
//	        1. SUV, 2. 세단, 3. 슈퍼카, 0. 종류 : 1
//
//	        자동차의 이름은 무엇인가요? 붕붕카
//
//	        반복해서 입력을 받는다.
//
//	        출력
//	        자동차 종류 : SUV
//	        이름 : 붕붕카
//	        가격 : 싸다
//	        색상 : 빨간색
//	        시동방법 : 버튼을 눌러 시동을 겁니다.
//
//	        --------------------------
//	       자동차 정보
//	       SUV
//	       가격 : 싸다
//	       색상 : 빨간색
//	       시동 방법 : 버튼을 눌러 시동은 겁니다.
//
//	        세단
//	        가격 : 보통이다
//	        색상 : 검은색
//	        시동 방법 : 카드를 올려둡니다.
//
//	      슈퍼카
//	        가격 : 비싸다
//	        색상 : 노란색
//	        시동 방법 : 지문 인식으로 시동을 겁니다.
//
//
//	      ---------------------------------------------
//
//	      조건)
//	        시동 방법은 메서드로 구현한다.
//	        자동차는 Car 라는 클래스를 상속 받게 한다.
//	        시동 방법 메서드는 추상 메서드로 정의한다.
//	        Car를 상속받는 클래스를 따로 만들지 않고 익명 중첩 클래스를 사용한다.
		
		// Factory 객체 생성한다.
		Factory factory = new Factory();
		
		// 자동차 종류
		int carType = 0;
		
		do {
			// 자동자 종류를 입력받는다.
			carType = factory.inputCarType();
			
			if(carType != 0) {
				// 자동차 정보를 입력받는다.
				factory.inputCarInfo(carType);
			}
		} while(carType != 0);
		
		factory.printCarInfo();
	}

}







