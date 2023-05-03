package com.test.main;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = new Factory();
		int typeCar = 0;

		do {
			typeCar = factory.inputCarType();

			if (typeCar != 0) {
				factory.inputCarInfo(typeCar);
			}
		} while (typeCar != 0);

		factory.printCarInfo();
	}

}


