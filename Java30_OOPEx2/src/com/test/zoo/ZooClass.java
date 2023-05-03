package com.test.zoo;

import java.util.Scanner;

public class ZooClass {
	
	Scanner scanner;
	
	// 동물객체들을 담을 배열
	public AnimalClass [] animalArray;
	// 동물의 수
	public int animalCount;
	
	public ZooClass(Scanner scanner) {
		this.scanner = scanner;
		animalArray = new AnimalClass[1000];
		animalCount = 0;
	}
	
	// 동물을 추가하는 메서드
	public void addAnimal(AnimalClass animal) {
		animalArray[animalCount] = animal;
		animalCount++;
	}
	
	// 입력한 동물들의 정보를 출력하는 메서드
	public void printAnimalInfo() {
		// 동물의 수 만큼 반복한다.
		for(int i = 0 ; i < animalCount ; i++) {
			AnimalClass animal = animalArray[i];
			animal.printInfo();
			animal.howEat();
			System.out.println();
		}
	}
}






