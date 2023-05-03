package com.test.main;

import com.test.zoo.ZooClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ZooClass zooClass = new ZooClass();
		int typeNumber = 0;

		do {
			typeNumber = zooClass.inputAnimalType();
			
			if(typeNumber!=0) {
				zooClass.addAnimal(typeNumber);
			}
		} while (typeNumber != 0);
		
		zooClass.printAnimalInfo();
	}

}
