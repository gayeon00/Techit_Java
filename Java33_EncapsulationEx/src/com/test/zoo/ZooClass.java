package com.test.zoo;

import java.util.Scanner;

public class ZooClass {

	// private이라 외부에서 접근 X
	private Scanner scanner;
	// 동물객체들을 담을 배열
	private AnimalClass[] animalArray;
	// 동물의 수
	private int animalCount;

	public ZooClass() {
		this.scanner = new Scanner(System.in);
		animalArray = new AnimalClass[1000];
		animalCount = 0;
	}

	// 동물을 추가하는 메서드
    public void addAnimal(int typeNumber) {
        
        // 동물의 이름을 입력받는다.
        System.out.print("동물의 이름을 입력해주세요 : ");
        String name = scanner.next();
        // 동물 객체를 생성한다.
        AnimalClass animal = null;
        
        switch(typeNumber) {
        case 1 :
            animal = new ElephantClass(name);
            break;
        case 2 :
            animal = new DesertFoxClass(name);
            break;
        case 3 :
            animal = new KangarooClass(name);
            break;
        }
        
        animalArray[animalCount] = animal;
        animalCount++;
    }

	// 입력한 동물들의 정보를 출력하는 메서드
	public void printAnimalInfo() {
		// 동물의 수 만큼 반복한다.
		for (int i = 0; i < animalCount; i++) {
			AnimalClass animal = animalArray[i];
			animal.printInfo();
			animal.howEat();
			System.out.println();
		}
	}
	
    public int inputAnimalType() {
        // 동물 타입 번호를 입력받는다.
        System.out.println("동물의 타입을 입력해주세요");
        System.out.print("1.코끼리, 2.사막여우, 3.캥거루, 0.종료 : ");
        return scanner.nextInt();
    }
    
    

}

class AnimalClass {
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

class ElephantClass extends AnimalClass {

	public ElephantClass(String name) {
		this.type = "코끼리";
		this.name = name;
		this.numberLegs = 4;
		this.lengthNose = "길다";
		this.bodySize = "크다";
	}

	@Override
	public void howEat() {
		System.out.println("코를 이용해 먹습니다");
	}
}

class KangarooClass extends AnimalClass {

	public KangarooClass(String name) {
		this.type = "캥거루";
		this.name = name;
		this.numberLegs = 2;
		this.lengthNose = "짧다";
		this.bodySize = "크다";
	}

	@Override
	public void howEat() {
		System.out.println("나뭇잎을 뜯어 먹습니다");
	}
}

class DesertFoxClass extends AnimalClass {

	public DesertFoxClass(String name) {
		this.type = "사막여우";
		this.name = name;
		this.numberLegs = 4;
		this.lengthNose = "짧다";
		this.bodySize = "작다";
	}

	@Override
	public void howEat() {
		System.out.println("손을 이용해 먹습니다");
	}
}
